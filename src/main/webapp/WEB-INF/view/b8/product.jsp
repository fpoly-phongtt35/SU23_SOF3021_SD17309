<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<h1> SD17309 Supermarket </h1>
<form>
    Enter something here: <input name="tenSanPham" value="${param.tenSanPham}"/>
    <input type="submit" value="Search"/>
</form>
<c:if test="${productList.isEmpty()}">
    <h2> Not found any records! </h2>
</c:if>
<c:if test="${not productList.isEmpty()}">
    <p> Found ${productList.getTotalElements()} products </p>
    <table border="1">
        <tr>
            <th> Product Id </th>
            <th> Product Name </th>
        </tr>
        <c:forEach items="${productList.getContent()}" var="product">
            <tr>
                <td> ${product.maSanPham} </td>
                <td> ${product.tenSanPham} </td>
            </tr>
        </c:forEach>
    </table>

    <div>
        <c:if test="${productList.getNumber() gt 0}">
            <a href="?tenSanPham=${param.tenSanPham}&page=${productList.getNumber()}">
                Previous
            </a>
        </c:if>

        <span>${productList.getNumber() + 1} / ${productList.getTotalPages()}</span>

        <c:if test="${productList.getNumber() lt productList.getTotalPages() - 1}">
            <a href="?tenSanPham=${param.tenSanPham}&page=${productList.getNumber() + 2}">
                Next
            </a>
        </c:if>

    </div>
</c:if>
