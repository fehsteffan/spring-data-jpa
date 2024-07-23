package com.bookstore.jpa.repositories;

import com.bookstore.jpa.model.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BookRepository extends JpaRepository<BookModel, UUID> {

    BookModel findBookModelByTitle(String tile);


}
