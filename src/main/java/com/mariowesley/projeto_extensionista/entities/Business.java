package com.mariowesley.projeto_extensionista.entities;

import com.mariowesley.projeto_extensionista.entities.enums.Category;
import jakarta.persistence.*;

@Entity
public class Business {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String businessName;
    private String description;
    private Category category;
    private String ownerEmail;

    @ManyToOne
    private User owner;
}
