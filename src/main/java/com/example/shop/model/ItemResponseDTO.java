package com.example.shop.model;

import java.util.UUID;

public record ItemResponseDTO(UUID id, String title, String image, Integer price) {
    public ItemResponseDTO (Item item){
        this(item.getId(), item.getTitle(), item.getImage(), item.getPrice());
    }
}
