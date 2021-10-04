package tech.dumpsterfire.heroku.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.dumpsterfire.heroku.model.InventoryItems;

@Repository
public interface InventoryItemsRepository extends JpaRepository<InventoryItems, Long>{
}
