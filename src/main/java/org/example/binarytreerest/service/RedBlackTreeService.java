package org.example.binarytreerest.service;


import org.example.binarytreerest.binarytree.RedBlackTreeImpl;
import org.example.binarytreerest.entity.RedBlackTreeEntity;
import org.example.binarytreerest.repository.RedBlackTreeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RedBlackTreeService {
    private final RedBlackTreeRepository repository;
    private final RedBlackTreeImpl<Integer> binaryTree;

    public RedBlackTreeService(RedBlackTreeRepository repository, RedBlackTreeImpl<Integer> binaryTree) {
        this.repository = repository;
        this.binaryTree = binaryTree;
    }

    public List<RedBlackTreeEntity> getAllNodes() {
        return repository.findAll();
    }

    public RedBlackTreeEntity getNodeById(UUID id) {
        return repository.findById(id).orElse(null);
    }

    public RedBlackTreeEntity addNode(Integer value) {
        return binaryTree.insertNode(value);
    }

    public void deleteNode(Integer value) {
        binaryTree.deleteNode(value);
    }
}
