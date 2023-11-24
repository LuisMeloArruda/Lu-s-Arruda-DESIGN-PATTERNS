package commandTESTS;

import org.junit.jupiter.api.Test;
import command.StringDrink;
import command.StringInverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringInverterTEST {
    @Test
    public void stringInverter() {
        StringDrink drink = new StringDrink("ABCD");
        StringInverter si = new StringInverter();
        si.execute(drink);
        assertEquals("DCBA", drink.getText());
    }
}
