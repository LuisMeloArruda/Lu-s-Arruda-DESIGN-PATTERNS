package command;


public class StringCaseChanger implements StringTransformer {
    @Override
    public void execute(StringDrink drink) {
        StringBuilder temp  = new StringBuilder();
        for (char c : drink.getText().toCharArray()) {
            if (Character.isLowerCase(c)) temp.append(Character.toUpperCase(c));
            else {
                temp.append(Character.toLowerCase(c));
            }
        }
        drink.setText(temp.toString());
    }

    public void undo(StringDrink drink) {
        StringCaseChanger sc = new StringCaseChanger();
        sc.execute(drink);
    }

}
