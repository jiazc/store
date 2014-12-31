<%--
  User: Jason.Jia
  Date: 2014/11/27
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/commons/taglibs.jsp" %>
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>商品管理系统</title>
        <script type="text/javascript">
        </script>
    </head>
    <body>
        <form id="login" action="<c:url value="/login/login/login.do"/>" method="post">
        	<table>
        		<tr align="center">
        			<td>用户名</td>
        			<td><input type="text" id="username" name="username"/></td>
        		</tr>
        		<tr>
        			<td>密码</td>
        			<td><input type="password" id="password" name="password"/></td>
        		</tr>
        		<tr>
        			<td colspan="6">
        				<div align="center">
							<input type="submit" value="登录"/>        			
        				</div>
        			</td>
        		</tr>
        	</table>
        </form>
    </body>
</html>
