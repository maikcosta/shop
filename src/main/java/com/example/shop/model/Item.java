package com.example.shop.model;

import com.example.shop.controller.ItemRequestDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Table(name="item")
@Entity(name="item")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Item {
    @Id
    @UuidGenerator
    private UUID id;
    private String title;
    private String image;
    private Integer price;

    public Item(ItemRequestDTO data){
        this.title = data.title();
        this.image = data.image();
        this.price = data.price();
    }


}
