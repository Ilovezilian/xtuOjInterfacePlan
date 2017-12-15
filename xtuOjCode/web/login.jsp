<%@page pageEncoding="UTF-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<HTML><HEAD><TITLE>用户登录</TITLE>
<META content="text/html; charset=utf-8" http-equiv=Content-Type>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/style.css">
<style type="text/css">
  #tab-list *{
   display:inline-block;}
</style>
</HEAD>
<BODY >
<%@ include file="navigation.jsp"%>

<!--登录表单  -->
<div class="formDiv">
 <form method="post" name="login" class="form-horizontal" action="loginServlet" role="form" >
 	<div class="form-group " id="tab-list"  class="loginType1">
	</div>
 	<div class="form-group">
 		<label for="username" class="col-sm-2 col-sm-offset-2 control-label">账号：</label>
   		 <div class="col-sm-3">
   		 <input type="text" class="form-control" id="username"  name="username" placeholder="请输入账号">
 		 </div>
 	</div>
 	<div class="form-group">
 	<label for="password" class="col-sm-2 col-sm-offset-2 control-label">密码：</label>
 		 <div class="col-sm-3">
 		 <input type="password" id="password" name="password" class="form-control"  placeholder="请输入密码">
 		 </div>	
 	</div>
 	<div >
 		<div class="col-sm-offset-4 col-sm-2" >
 		<input type="checkbox"  id="remember" >记住密码
 		</div>
 		<div class="col-sm-2">
 		<input type="submit" class="btn btn-info btn-lg" value="登录" >
 		</div>
 	</div>
 </form>
 
 <div style="text-align:center; margin:100px;">
  <a class="col-sm-2 col-sm-offset-3" href=<%=basePath+"register.jsp" %>>注册账号</a>
  <a class="col-sm-2" href=<%=basePath+"forgetPassword.jsp"%>>忘记密码？</a>
 </div>
</div> 
</BODY></HTML>
