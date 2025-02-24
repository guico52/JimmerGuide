package com.guico.jimmerguide.entity

import org.babyfish.jimmer.sql.*


/**
 * <p>
 *  book_author_mapping

 * </p>
 *
 * @author guico
 * @date 2025-02-24
 */
@Entity
@Table(name = "book_author_mapping")
public interface BookAuthorMapping {

    /**
     *  book_id

     */
    @Id
    @Column(name = "book_id")
    val bookId: Long

    /**
     *  author_id

     */
    @Column(name = "author_id")
    val authorId: Long

}
