package com.mylibrary.repository;
import com.mylibrary.domain.Book;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = BookRepository
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Book.class)
public interface BookRepository extends DetachableJpaRepository<Book, Long>, BookRepositoryCustom {
}
