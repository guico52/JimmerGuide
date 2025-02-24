package com.guico.jimmerguide.entity

import java.time.LocalDateTime
import org.babyfish.jimmer.sql.*


/**
 * <p>
 *  book_store

 * </p>
 *
 * @author guico
 * @date 2025-02-24
 */
@Entity
@Table(name = "book_store")
public interface BookStore {

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
     *  website

     */
    val website: String?

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

    @OneToMany(mappedBy = "bookStore")
    val books: List<Book>

}
