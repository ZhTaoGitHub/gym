<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Hello World!</h2>
    <c:forEach items="${pageContext.findAttribute('deps')}" var="item">
        |${item.depName}|<br/>
        <br/>
    </c:forEach>

</body>
</html>
