package factoryMethod;

import command.*;
import observer.*;
import strategy.OrderingStrategy;

public abstract class AlienClient implements Client {
    private OrderingStrategy strategy;
    protected abstract OrderingStrategy createOrderingStrategy();

    public AlienClient() {
        this.strategy = createOrderingStrategy();
    }

    @Override
    public void happyHourStarted(Bar bar) {
        strategy.happyHourStarted((StringBar) bar);
    }
    @Override
    public void happyHourEnded(Bar bar) {
        strategy.happyHourEnded((StringBar) bar);
    }
    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        strategy.wants(drink, recipe, bar);
    }
}
