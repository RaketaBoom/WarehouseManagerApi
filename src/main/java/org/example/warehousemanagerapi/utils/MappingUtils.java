package org.example.warehousemanagerapi.utils;

import org.example.warehousemanagerapi.dto.WarehouseGoodCreateDto;
import org.example.warehousemanagerapi.dto.WarehouseGoodFullDto;
import org.example.warehousemanagerapi.dto.WarehouseGoodUpdateDto;
import org.example.warehousemanagerapi.model.WarehouseGood;
import org.springframework.stereotype.Service;

@Service
public class MappingUtils {
    public WarehouseGood mapWGFulltoWarehouseGood (WarehouseGoodFullDto warehouseGoodFullDto){
        return WarehouseGood.builder()
                .id(warehouseGoodFullDto.getId())
                .name(warehouseGoodFullDto.getName())
                .article(warehouseGoodFullDto.getArticle())
                .description(warehouseGoodFullDto.getDescription())
                .category(warehouseGoodFullDto.getCategory())
                .quantity(warehouseGoodFullDto.getQuantity())
                .price(warehouseGoodFullDto.getPrice())
                .lastUpdateQuantityDateTime(warehouseGoodFullDto.getLastUpdateQuantityDateTime())
                .creationDate(warehouseGoodFullDto.getCreationDate())
                .build();
    }

    public WarehouseGoodFullDto mapWarehouseGoodtoWGFull(WarehouseGood warehouseGood){
        return WarehouseGoodFullDto.builder()
                .id(warehouseGood.getId())
                .name(warehouseGood.getName())
                .article(warehouseGood.getArticle())
                .description(warehouseGood.getDescription())
                .category(warehouseGood.getCategory())
                .price(warehouseGood.getPrice())
                .quantity(warehouseGood.getQuantity())
                .lastUpdateQuantityDateTime(warehouseGood.getLastUpdateQuantityDateTime())
                .creationDate(warehouseGood.getCreationDate())
                .build();
    }

    public WarehouseGood mapWGCreatetoWarehouseGood(WarehouseGoodCreateDto warehouseGoodCreateDto)
    {
        return WarehouseGood.builder()
                .name(warehouseGoodCreateDto.getName())
                .article(warehouseGoodCreateDto.getArticle())
                .description(warehouseGoodCreateDto.getDescription())
                .category(warehouseGoodCreateDto.getCategory())
                .price(warehouseGoodCreateDto.getPrice())
                .quantity(warehouseGoodCreateDto.getQuantity())
                .build();
    }

    public WarehouseGoodCreateDto mapWarehouseGoodtoWGCreate(WarehouseGood warehouseGood)
    {
        return WarehouseGoodCreateDto.builder()
                .name(warehouseGood.getName())
                .article(warehouseGood.getArticle())
                .description(warehouseGood.getDescription())
                .category(warehouseGood.getCategory())
                .price(warehouseGood.getPrice())
                .quantity(warehouseGood.getQuantity())
                .build();
    }

    public WarehouseGood mapWGUpdatetoWarehouseGood(WarehouseGoodUpdateDto warehouseGoodUpdateDto)
    {
        return WarehouseGood.builder()
                .name(warehouseGoodUpdateDto.getName())
                .article(warehouseGoodUpdateDto.getArticle())
                .description(warehouseGoodUpdateDto.getDescription())
                .category(warehouseGoodUpdateDto.getCategory())
                .price(warehouseGoodUpdateDto.getPrice())
                .quantity(warehouseGoodUpdateDto.getQuantity())
                .build();
    }

    public WarehouseGoodUpdateDto mapWarehouseGoodtoWGUpdate(WarehouseGood warehouseGood)
    {
        return WarehouseGoodUpdateDto.builder()
                .name(warehouseGood.getName())
                .article(warehouseGood.getArticle())
                .description(warehouseGood.getDescription())
                .category(warehouseGood.getCategory())
                .price(warehouseGood.getPrice())
                .quantity(warehouseGood.getQuantity())
                .build();
    }
}
