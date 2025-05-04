package com.szalai.liquidace.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "houses")
@NoArgsConstructor
@AllArgsConstructor
public class House {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "price")
    private Long price;

    @Column(name = "created_at")
    private Long createdAt;
}
