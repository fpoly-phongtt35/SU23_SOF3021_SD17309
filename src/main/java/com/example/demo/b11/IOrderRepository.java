package com.example.demo.b11;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IOrderRepository
        extends JpaRepository<Order, Integer> {

    @Query("SELECT o FROM Order o ORDER BY o.createdDate")
    List<Order> timHet();

    @Query("""
        SELECT o FROM Order o
            WHERE o.customerNumber LIKE :sdt
    """)
    List<Order> timTheoSdt(@Param("sdt") String soDienThoai);

    @Query("""
        SELECT o.orderId, o.createdDate
            FROM Order o WHERE o.customerNumber IS NULL
    """)
    List<OrderVangLai> timVangLai();
}
