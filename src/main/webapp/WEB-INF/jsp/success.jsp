<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Hello World!</h2>
    <c:forEach items="${pageContext.findAttribute('deps')}" var="item">
        |${item.depName}&nbsp;<a href="javascript:void(0)" onclick="delDepartment(${item.depId})" >删除</a> |<br/>
        <br/>
    </c:forEach>
    <script>
        function  delDepartment(depId) {
            console.log(depId);
            window.location.href = "<%=request.getContextPath()%>/test/delDep?depId="+depId;
        }
    </script>
</body>
</html>
