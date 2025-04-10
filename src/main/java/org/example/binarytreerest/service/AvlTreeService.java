package org.example.binarytreerest.service;

import org.example.binarytreerest.binarytree.AVLTreeImpl;
import org.example.binarytreerest.entity.AvlTreeEntity;
import org.example.binarytreerest.repository.AvlTreeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class AvlTreeService {
    private final AvlTreeRepository repository;
    private final AVLTreeImpl<Integer> binaryTree;

    public AvlTreeService(AvlTreeRepository repository, AVLTreeImpl<Integer> binaryTree) {
        this.repository = repository;
        this.binaryTree = binaryTree;
    }

    public List<AvlTreeEntity> getAllNodes() {
        return repository.findAll();
    }

    public AvlTreeEntity getNodeById(UUID id) {
        return repository.findById(id).orElse(null);
    }

    public AvlTreeEntity addNode(Integer value) {
        return binaryTree.insertNode(value);
    }

    @Transactional
    public void deleteNode(Integer value) {
        binaryTree.deleteNode(value);
    }
}
