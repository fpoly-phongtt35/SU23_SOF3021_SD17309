<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<h1> SD17309 Supermarket </h1>
<form>
    Enter something here: <input name="tenSanPham" value="${param.tenSanPham}"/>
    <input type="submit" value="Search"/>
</form>
<c:if test="${empty productList}">
    <h2> Not found any records! </h2>
</c:if>
<c:if test="${not empty productList}">
    <p> Found ${productList.size()} products </p>
    <table border="1">
        <tr>
            <th> Product Id </th>
            <th> Product Name </th>
        </tr>
        <c:forEach items="${productList}" var="product">
            <tr>
                <td> ${product.maSanPham} </td>
                <td> ${product.tenSanPham} </td>
            </tr>
        </c:forEach>
    </table>
</c:if>
