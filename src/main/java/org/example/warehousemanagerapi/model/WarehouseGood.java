package org.example.warehousemanagerapi.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WarehouseGood {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private String name;

    @Column(unique = true)
    private String article;

    @Column
    private String description;

    @Column
    private String category;

    @Column
    private BigDecimal price;

    @Column
    private BigDecimal quantity;

    @Column
    private LocalDateTime lastUpdateQuantityDateTime;

    @Column
    @CreationTimestamp
    private LocalDate creationDate;

    @Transient
    private BigDecimal previousQuantity;

    @PostLoad
    public void savePreviousQuantity(){
        previousQuantity = quantity;
    }

    @PreUpdate
    public void lastUpdateQuantityDateTime(){
        if (quantity != null && quantity.equals(previousQuantity)){
            lastUpdateQuantityDateTime = LocalDateTime.now();
        }
    }
}
