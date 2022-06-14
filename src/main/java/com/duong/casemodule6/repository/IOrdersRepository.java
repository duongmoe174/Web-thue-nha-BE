package com.duong.casemodule6.repository;

import com.duong.casemodule6.entity.order.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrdersRepository extends JpaRepository<Orders, Long> {
    @Query(value = "select * from orders join houses h on orders.house_id = h.id where status_order_id =1 AND h.user_id =?1", nativeQuery = true)
    Iterable<Orders> findAllOrderProcessingByUserId(Long user_id);
}
