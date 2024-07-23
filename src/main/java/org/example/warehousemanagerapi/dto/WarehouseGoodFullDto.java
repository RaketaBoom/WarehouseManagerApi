package org.example.warehousemanagerapi.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Getter
@Setter
public class WarehouseGoodFullDto {
    private UUID id;

    private String name;

    private String article;

    private String description;

    private String category;

    private BigDecimal price;

    private BigDecimal quantity;

    private LocalDateTime lastUpdateQuantityDateTime;

    private LocalDate creationDate;
}
