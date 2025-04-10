package org.example.binarytreerest.repository;

import org.example.binarytreerest.entity.RedBlackTreeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RedBlackTreeRepository extends JpaRepository<RedBlackTreeEntity, UUID> {
}
