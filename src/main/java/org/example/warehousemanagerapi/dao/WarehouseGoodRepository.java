package org.example.warehousemanagerapi.dao;


import org.example.warehousemanagerapi.model.WarehouseGood;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface WarehouseGoodRepository extends JpaRepository<WarehouseGood, UUID> {
}
