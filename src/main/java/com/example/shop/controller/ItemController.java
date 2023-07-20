package com.example.shop.controller;

import com.example.shop.model.Item;
import com.example.shop.model.ItemRepository;
import com.example.shop.model.ItemResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("item")
public class ItemController {
    @Autowired
    private ItemRepository itemRepository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveItem(@RequestBody ItemRequestDTO data){
        Item itemData = new Item(data);
        itemRepository.save(itemData);
        return;
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<ItemResponseDTO> getAll(){
        List<ItemResponseDTO> itemList = itemRepository.findAll().stream().map(ItemResponseDTO::new).toList();
        return itemList;
    }
}
