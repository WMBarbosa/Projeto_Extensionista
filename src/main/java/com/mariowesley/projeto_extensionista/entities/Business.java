package com.mariowesley.projeto_extensionista.entities;

import com.mariowesley.projeto_extensionista.entities.enums.Category;
import jakarta.persistence.*;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Business business)) return false;
        return Objects.equals(id, business.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
