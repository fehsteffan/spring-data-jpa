package com.bookstore.jpa.repositories;

import com.bookstore.jpa.model.PublisherModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PublisherRepository extends JpaRepository<PublisherModel, UUID> {
}
