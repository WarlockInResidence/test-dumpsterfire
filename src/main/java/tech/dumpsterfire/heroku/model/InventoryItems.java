package tech.dumpsterfire.heroku.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "items")
public class InventoryItems implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String owner = "family";
    private String itemName;
    private String itemType;
    private String building;
    private String room;
    private String container;
    private float weight;
    private String imageUrl;

    public InventoryItems(String owner, String itemName, String itemType, String building, String room, String container, float weight, String imageUrl) {
        this.owner = owner;
        this.itemName = itemName;
        this.itemType = itemType;
        this.building = building;
        this.room = room;
        this.container = container;
        this.weight = weight;
        this.imageUrl = imageUrl;
    }

    public InventoryItems() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long item_id) {
        this.id = item_id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String item_name) {
        this.itemName = item_name;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}