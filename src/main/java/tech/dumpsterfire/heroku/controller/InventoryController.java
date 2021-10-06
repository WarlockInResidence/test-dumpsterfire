package tech.dumpsterfire.heroku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.dumpsterfire.heroku.dao.InventoryItemsRepository;
import tech.dumpsterfire.heroku.model.InventoryItems;

@RestController
public class InventoryController {
    @Autowired
    private InventoryItemsRepository inventoryItemsRepository;


//    // Create Items - Post
//    @PostMapping("/items")
//    public InventoryItems createItems(@RequestBody InventoryItems item) {
//        return this.inventoryItemsRepository.save(item);
//    }

//    // Read - Get id
//    @GetMapping("/items/{id}")
//    public Optional<InventoryItems> itemById(@PathVariable Long id) {
//        return this.inventoryItemsRepository.findById(id);
//    }
//
//    // Update - Patch
//    @PatchMapping("/items/{id}")
//    public Object updateItemWithPatchById(@PathVariable Long id,
//                                          @RequestBody InventoryItems updateItemEntity) {
//        if (!inventoryItemsRepository.existsById(id)) return inventoryItemsRepository.save(updateItemEntity);
//
//        InventoryItems patchItem = inventoryItemsRepository.findById(id).orElse(null);
//
//        if (updateItemEntity.getId() != null) patchItem.setId(updateItemEntity.getId());
//        if (updateItemEntity.getOwner() != null) patchItem.setOwner(updateItemEntity.getOwner());
//        if (updateItemEntity.getItemName() != null) patchItem.setItemName(updateItemEntity.getItemName());
//        if (updateItemEntity.getItemType() != null) patchItem.setItemType(updateItemEntity.getItemType());
//        if (updateItemEntity.getBuilding() != null) patchItem.setBuilding(updateItemEntity.getBuilding());
//        if (updateItemEntity.getRoom() != null) patchItem.setRoom(updateItemEntity.getRoom());
//        if (updateItemEntity.getContainer() != null) patchItem.setContainer(updateItemEntity.getContainer());
//        if (updateItemEntity.getWeight() != 0.0f) patchItem.setWeight(updateItemEntity.getWeight());
//        if (updateItemEntity.getImageUrl() != null) patchItem.setImageUrl(updateItemEntity.getImageUrl());
//
//        return inventoryItemsRepository.save(patchItem);
//    }
//
//    // Delete - Delete
//    @DeleteMapping("/items/{id}")
//    public String deleteItem(@PathVariable Long id) {
//        InventoryItems deleteItem = this.inventoryItemsRepository.findById(id).get();
//        if (deleteItem != null) {
//            this.inventoryItemsRepository.deleteById(id);
//            return this.inventoryItemsRepository.count() + " users remaining.";
//        } else
//            return "Item not found, try another user Id.";
//    }

    // List - Get all the items
    @GetMapping("/items")
    public Iterable<InventoryItems> getAllTheItems() {
        return this.inventoryItemsRepository.findAll();
    }

}
