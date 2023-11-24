package command;

import java.util.List;

public class StringRecipe {
    private List<StringTransformer> list;

    public StringRecipe(List<StringTransformer> transformers) {
        this.list = transformers;
    }

    public void mix(StringDrink drink) {
        for (StringTransformer st : list) {
            st.execute(drink);
        }
    }

}
