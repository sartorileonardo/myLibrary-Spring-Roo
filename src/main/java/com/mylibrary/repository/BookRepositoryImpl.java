package com.mylibrary.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.mylibrary.domain.Book;

/**
 * = BookRepositoryImpl
 *
 * Implementation of BookRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = BookRepositoryCustom.class)
public class BookRepositoryImpl extends QueryDslRepositorySupportExt<Book> implements BookRepositoryCustom{

    /**
     * Default constructor
     */
    BookRepositoryImpl() {
        super(Book.class);
    }
}