package observer;

import command.StringDrink;
import command.StringRecipe;

import java.util.ArrayList;
import java.util.List;

public class StringBar extends Bar {
    public StringBar() {
        this.boleano = false;
        this.observers = new ArrayList<>();
    }
    public StringBar(List<BarObserver> list) {
        this.observers = list;
    }
    @Override
    public boolean isHappyHour() {
        return boleano;
    }
    @Override
    public void startHappyHour() {
        this.boleano = true;
        notifyObservers();
    }

    @Override
    public void endHappyHour() {
        this.boleano = false;
        notifyObservers();
    }

    public void order(StringDrink drink, StringRecipe recipe) {
        recipe.mix(drink);
    }
}
