package org.example.warehousemanagerapi.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
public class WarehouseGoodCreateDto {

    @NotBlank(message = "Name can't be blank")
    private String name;

    @NotBlank(message = "Article can't be blank")
    private String article;

    @NotBlank(message = "Description can't be blank")
    private String description;

    @NotBlank(message = "Category can't be blank")
    private String category;

    @NotBlank(message = "Price can't be blank")
    @Min(value = 1, message = "Price can't be negative or zero")
    private BigDecimal price;

    @NotBlank(message = "Quantity can't be blank")
    @Min(value = 1, message = "Quantity can't be negative or zero")
    private BigDecimal quantity;
}
