package string;

import java.util.ArrayList;
import java.util.List;

public class StringRecipe {
    private List<StringTransformer> list;

    StringRecipe(List<StringTransformer> transformers ) {
        this.list = transformers;
    }

    public void mix(StringDrink drink) {
        for (StringTransformer st : list) {
            st.execute(drink);
        }
    }

}
