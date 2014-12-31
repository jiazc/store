<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script type="text/javascript">
	function init(){
		var message="${message}";
		if(message!=""){
			alert(message);
		};
    }
    init();
</script>