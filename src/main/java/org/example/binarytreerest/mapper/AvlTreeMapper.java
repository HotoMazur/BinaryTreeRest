package org.example.binarytreerest.mapper;

import org.example.binarytreerest.dto.AvlTreeDto;
import org.example.binarytreerest.entity.AvlTreeEntity;
import org.springframework.stereotype.Component;

@Component
public class AvlTreeMapper {
    public AvlTreeDto AvlTreeEntityToDto(AvlTreeEntity avlTreeEntity) {
        return new AvlTreeDto(avlTreeEntity.getId(),
                avlTreeEntity.getValue(),
                avlTreeEntity.getHeight(),
                avlTreeEntity.getLeft_id() != null ? avlTreeEntity.getLeft_id() : null,
                avlTreeEntity.getRight_id() != null ? avlTreeEntity.getRight_id() : null);
    }
}
