package com.guico.jimmerguide.entity

import java.math.BigDecimal
import java.time.LocalDateTime
import org.babyfish.jimmer.sql.*


/**
 * <p>
 *  book

 * </p>
 *
 * @author guico
 * @date 2025-02-24
 */
@Entity
@Table(name = "book")
public interface Book {

    /**
     *  id

     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long

    /**
     *  name

     */
    @Key
    val name: String

    /**
     *  edition

     */
    @Key
    val edition: Int

    /**
     *  price

     */
    val price: BigDecimal

    /**
     *  store_id

     */
    @Column(name = "store_id")
    val storeId: Long?

    /**
     *  tenant

     */
    val tenant: String

    /**
     *  created_time

     */
    @Column(name = "created_time")
    val createdTime: LocalDateTime

    /**
     *  modified_time

     */
    @Column(name = "modified_time")
    val modifiedTime: LocalDateTime

    @ManyToMany
    @JoinTable(
        name = "book_author_mapping",
        joinColumns = [JoinColumn(name = "book_id")],
        inverseJoinColumns = [JoinColumn(name = "author_id")]
    )
    val authors: List<Author>

    @ManyToOne
    val bookStore: BookStore

}
