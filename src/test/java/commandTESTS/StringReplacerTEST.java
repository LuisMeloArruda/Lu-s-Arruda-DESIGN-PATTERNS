package commandTESTS;

import org.junit.jupiter.api.Test;
import command.StringDrink;
import command.StringReplacer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringReplacerTEST {
    @Test
    public void stringReplacer() {
        StringDrink drink = new StringDrink("ABCDABCD");
        StringReplacer sr = new StringReplacer('A', 'X');
        sr.execute(drink);
        assertEquals("XBCDXBCD", drink.getText());
    }
}
