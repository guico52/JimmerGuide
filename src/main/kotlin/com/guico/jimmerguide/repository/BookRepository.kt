package com.guico.jimmerguide.repository

import com.guico.jimmerguide.entity.Book
import org.babyfish.jimmer.spring.repository.KRepository
import org.springframework.stereotype.Repository

/**
 * <p>
 * BookRepository 接口
 * </p>
 *
 * @author guico
 * @date 2025-02-24
 */
@Repository
public interface BookRepository : KRepository<Book, Long> {

}

