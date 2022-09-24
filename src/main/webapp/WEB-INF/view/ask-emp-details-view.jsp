<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html> 
<body>
<h2>Dear Employee, please, enter your details:</h2>
<br>
<br>
<!--<form action="showDetails" method="get">
    <input type="text" name="employeeName"
           placeholder="Write your name"/>
    <input type="submit"/>
</form>-->
<form:form action="showDetails" modelAttribute="employee">
    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br>
<br>
    Surname <form:input path="surname"/>
     <form:errors path="surname"/>
    <br>

<br>
    Phone <form:input path="phoneNumber"/>
     <form:errors path="phoneNumber"/>
    <br>
<br>
    Salary <form:input path="salary"/>
     <form:errors path="salary"/>
    <br>
<br>
Department <form:select path="department">
    <form:options items="${employee.departments}"/>
 </form:select>
    <br>
<br>
Which car do you want?
<form:radiobuttons path="carBrand" items="${employee.cars}"/>

<br>
<br>
Foreign language(s)
<form:checkboxes path="languages" items="${employee.languageList}"/>

<br>
<br>
    <input type="submit" value="OK">
</form:form>
</body>
</html> 
