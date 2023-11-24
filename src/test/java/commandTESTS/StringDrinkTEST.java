package commandTESTS;


import org.junit.jupiter.api.Test;
import command.StringDrink;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringDrinkTEST {
    @Test
    public void stringDrink() {
        StringDrink drink = new StringDrink("ABCD");
        assertEquals("ABCD", drink.getText());
        drink.setText("DCBA");
        assertEquals("DCBA", drink.getText());
    }
}
