package tech.dumpsterfire.heroku.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tech.dumpsterfire.heroku.model.InventoryItems;

@Component
public class DatabaseSeeder implements CommandLineRunner {

    @Autowired
    InventoryItemsRepository inventoryItemsRepository;

    @Override
    public void run(String... args) throws Exception {
        loadData();
    }


    private void loadData() {
        if (inventoryItemsRepository.count() == 0) {
            InventoryItems item1 = new InventoryItems("Papa", "snorkel", "recreation", "house", "office", "tough box #1", 1.0f, "www.google.com");
            InventoryItems item2 = new InventoryItems("family", "car", "recreation", "house", "garage", "n/a", 1000.0f, "www.google.com");
            InventoryItems item3 = new InventoryItems("Oma", "cell phone", "communication", "house", "All", "n/a", 1.0f, "www.google.com");
            InventoryItems item4 = new InventoryItems("Kid 1", "stuffed bear", "toy", "house", "kid 1", "n/a", 3.0f, "www.google.com");
            InventoryItems item5 = new InventoryItems("Kid 2", "stuffed unicorn", "toy", "house", "kid 2", "bed", 5.0f, "www.google.com");
            inventoryItemsRepository.save(item1);
            inventoryItemsRepository.save(item2);
            inventoryItemsRepository.save(item3);
            inventoryItemsRepository.save(item4);
            inventoryItemsRepository.save(item5);
        }

    }
}
