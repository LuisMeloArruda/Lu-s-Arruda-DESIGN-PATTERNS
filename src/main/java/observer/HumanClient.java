package observer;

import command.StringDrink;
import command.StringRecipe;
import strategy.OrderingStrategy;

public class HumanClient implements Client {
    private OrderingStrategy strategy;

    public HumanClient(OrderingStrategy os) {
        this.strategy = os;
    }
    @Override
    public void happyHourStarted(Bar bar) {
        this.strategy.happyHourStarted((StringBar) bar);
    }
    @Override
    public void happyHourEnded(Bar bar) {
        this.strategy.happyHourEnded((StringBar) bar);
    }
    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        this.strategy.wants(drink, recipe, bar);
    }
}
