<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>铃铛书城注册页面</title>
	<!--写base标签，永远固定相对路径跳转的结果-->
	<%@include file="/pages/common/head.jsp" %>
<style type="text/css">
	h1 {
		text-align: center;
		margin-top: 200px;
	}
	
	h1 a {
		color:red;
	}
</style>
</head>
<body>
		<div id="header">
				<img class="logo_img" alt="" src="static/img/logo.gif" >
				<span class="wel_word"></span>
<%--			静态包含登陆成功的菜单--%>
			<%@include file="/pages/common/login_success_menu.jsp"%>
		<%--		<div>
					<span>欢迎<span class="um_span">韩总</span>光临铃铛书城</span>
					<a href="../order/order.jsp">我的订单</a>
					<a href="../../index.jsp">注销</a>&nbsp;&nbsp;
					<a href="../../index.jsp">返回</a>
				</div>--%>
		</div>
		
		<div id="main">
		
			<h1>注册成功! <a href="../../index.jsp">转到主页</a></h1>
	
		</div>

		<%@include file="/pages/common/foot.jsp" %>
</body>
</html>