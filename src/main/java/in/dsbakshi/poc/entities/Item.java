package in.dsbakshi.poc.entities;

import java.math.BigDecimal;

public class Item {

    private Long id;

    private String reference;

    private String itemCategory;

    private BigDecimal itemCost;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public BigDecimal getItemCost() {
        return itemCost;
    }

    public void setItemCost(BigDecimal itemCost) {
        this.itemCost = itemCost;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", reference='" + reference + '\'' +
                ", itemCategory='" + itemCategory + '\'' +
                ", itemCost=" + itemCost +
                '}';
    }
}
