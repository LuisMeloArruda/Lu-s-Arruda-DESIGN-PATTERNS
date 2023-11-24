package strategy;

import command.StringDrink;
import command.StringRecipe;
import observer.StringBar;

public class ImpatientStrategy implements OrderingStrategy{
    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        bar.order(drink, recipe);
    }
    @Override
    public void happyHourStarted(StringBar bar) {
        System.out.println("O happyhour do StringBar começou");
    }
    @Override
    public void happyHourEnded(StringBar bar) {
        System.out.println("O happyhour do StringBar acabou");

    }
}
