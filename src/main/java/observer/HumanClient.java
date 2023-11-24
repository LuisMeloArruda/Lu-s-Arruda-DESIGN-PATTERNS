package observer;

import command.StringDrink;
import command.StringRecipe;
import strategy.OrderingStrategy;

import java.security.PublicKey;

public class HumanClient implements Client {
    private OrderingStrategy os;

    public HumanClient(OrderingStrategy os) {
        this.os = os;
    }
    @Override
    public void happyHourStarted(Bar bar) {
        this.os.happyHourStarted((StringBar) bar);
    }
    @Override
    public void happyHourEnded(Bar bar) {
        this.os.happyHourEnded((StringBar) bar);
    }
    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        this.os.wants(drink, recipe, (StringBar) bar);
    }
}
