package com.bookstore.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table(name = "book")
public class Book implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, name = "book_id", nullable = false)
    private Integer bookId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "isbn", nullable = false)
    private String isbn;

    @Column(name = "image", nullable = false)
    private byte[] image;

    @Column(name = "price", nullable = false)
    private Float price;

    @Column(name = "publish_date", nullable = false)
    private Date publishDate;

    @Column(name = "last_update_time", nullable = false)
    private Date lastUpdateTime;

    @Column(name = "category_id", nullable = false)
    private Integer categoryId;


}