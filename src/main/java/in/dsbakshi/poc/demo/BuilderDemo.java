package in.dsbakshi.poc.demo;

import in.dsbakshi.poc.entities.Item;
import in.dsbakshi.poc.entities.builders.ItemBuilder;

import java.math.BigDecimal;

public class BuilderDemo {

    public static void main(String[] args) {
        new BuilderDemo().doTheDemo();
    }

    private void doTheDemo() {
        Item basicItem = basicItemBuilder()
                .build();
        System.out.println(basicItem);

        Item itemWithCost = basicItemBuilder()
                .withItemCost(BigDecimal.TEN)
                .build();
        System.out.println(itemWithCost);

        Item itemWithCategoryAndCost = itemWithCategoryXBuilder()
                .withItemCost(BigDecimal.TEN)
                .build();
        System.out.println(itemWithCategoryAndCost);

        Item itemWithCategoryAndCostAndNewRef = itemWithCategoryXBuilder()
                .withReference("YOURITEM")
                .withItemCost(BigDecimal.ONE)
                .build();
        System.out.println(itemWithCategoryAndCostAndNewRef);
    }

    private ItemBuilder basicItemBuilder() {
        return new ItemBuilder()
                .withReference("MYITEM");
    }

    private ItemBuilder itemWithCategoryXBuilder() {
        return basicItemBuilder()
                .withItemCategory("X");
    }
}
