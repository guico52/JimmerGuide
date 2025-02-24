package com.guico.jimmerguide.entity

import java.time.LocalDateTime
import org.babyfish.jimmer.sql.*


/**
 * <p>
 *  author

 * </p>
 *
 * @author guico
 * @date 2025-02-24
 */
@Entity
@Table(name = "author")
public interface Author {

    /**
     *  id

     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long

    /**
     *  first_name

     */
    @Key
    @Column(name = "first_name")
    val firstName: String

    /**
     *  last_name

     */
    @Key
    @Column(name = "last_name")
    val lastName: String

    /**
     *  gender

     */
    val gender: String

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

    @OneToMany(mappedBy = "author")
    val books: List<Book>

}
