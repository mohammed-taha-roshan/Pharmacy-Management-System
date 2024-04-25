package com.library.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "categories", uniqueConstraints = @UniqueConstraint(columnNames = "name"))
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long id;
    private String name;
    @Column(name = "is_activated")
    private boolean activated;
    @Column(name = "is_deleted")
    private boolean deleted;

    // Constructor, getters, setters, etc.

    // Builder class
    public static class Builder {
        private Long id;
        private String name;
        private boolean activated;
        private boolean deleted;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder activated(boolean activated) {
            this.activated = activated;
            return this;
        }

        public Builder deleted(boolean deleted) {
            this.deleted = deleted;
            return this;
        }

        public Category build() {
            Category category = new Category();
            category.setId(this.id);
            category.setName(this.name);
            category.setActivated(this.activated);
            category.setDeleted(this.deleted);
            return category;
        }
    }

    // Getter for builder
    public static Builder builder() {
        return new Builder();
    }
}

