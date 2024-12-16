<%@ page contentType="text/html; charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<form:form action="save" modelAttribute="employee">
<form:label path="id">ID : </form:label>
<form:input path="id"/>
<form:label path="name">NAME : </form:label>
<form:input path="name"/>
<form:label path="phone">PHONE : </form:label>
<form:input path="phone"/>
<input type="submit" value="SAVE EMPLOYEE DETAILS">
</form:form>
</body>
</html>
