package strategy;

import command.StringDrink;
import command.StringRecipe;
import observer.StringBar;

import java.util.ArrayList;
import java.util.List;

public class SmartStrategy implements OrderingStrategy{
    private List<Orders> orders;
    public SmartStrategy() {
        this.orders = new ArrayList<>();
    }
    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if (bar.isHappyHour()) bar.order(drink, recipe);
        else {
            Orders order = new Orders(drink, recipe, bar);
            orders.add(order);
        }
    }
    @Override
    public void happyHourStarted(StringBar bar) {
        System.out.println("O happyhour do StringBar começou");
        while (!this.orders.isEmpty()) {
            this.orders.get(0).getBar().order(this.orders.get(0).getDrink(), this.orders.get(0).getRecipe());
            this.orders.remove(0);
        }
    }
    @Override
    public void happyHourEnded(StringBar bar) {
        System.out.println("O happyhour do StringBar acabou");
    }
}
