package string;

public class StringInverter implements StringTransformer {
    @Override
    public void execute(StringDrink drink) {
        StringBuilder Sb = new StringBuilder();
        Sb.append(drink.getText());
        Sb.reverse();
        drink.setText(Sb.toString());
    }

    public void undo(StringDrink drink) {
        StringInverter sc = new StringInverter();
        sc.execute(drink);
    }


}
