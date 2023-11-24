package observer;

import command.StringDrink;
import command.StringRecipe;

public class HumanClient implements Client{

    @Override
    public void happyHourStarted(Bar bar) {
        System.out.println("O bar está em happy hour");
    }
    @Override
    public void happyHourEnded(Bar bar) {
        System.out.println("O bar NÃO está em happy hour");
    }
    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar){}
}
