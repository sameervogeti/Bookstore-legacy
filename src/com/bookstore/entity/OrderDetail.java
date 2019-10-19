package com.bookstore.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "order_detail")
public class OrderDetail implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "book_id")
    private Integer bookId;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "subtotal", nullable = false)
    private Float subtotal;


}