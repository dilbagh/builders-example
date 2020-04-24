package in.dsbakshi.poc.entities.builders;

import in.dsbakshi.poc.entities.Item;

import java.math.BigDecimal;

public class ItemBuilder {

    private final Item item;

    public ItemBuilder() {
        item = new Item();
    }

    public ItemBuilder withReference(String reference) {
        item.setReference(reference);
        return this;
    }

    public ItemBuilder withItemCategory(String itemCategory) {
        item.setItemCategory(itemCategory);
        return this;
    }

    public ItemBuilder withItemCost(BigDecimal itemCost) {
        item.setItemCost(itemCost);
        return this;
    }

    public Item build() {
        return item;
    }

}
