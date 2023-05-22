<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<h1> SD17309 Supermarket </h1>
<table border="1">
    <tr>
        <th> Product Id </th>
        <th> Product Name </th>
        <th> Current Price </th>
        <th> Quantity </th>
    </tr>
    <c:forEach items="${danhSachSanPham}" var="sanPham">
        <tr>
            <td> ${sanPham.productId} </td>
            <td> ${sanPham.productName} </td>
            <td> ${sanPham.price} </td>
            <td> ${sanPham.quantity} </td>
        </tr>
    </c:forEach>
</table>
