package composite;

import command.StringDrink;
import command.StringTransformer;

import java.util.ArrayList;
import java.util.List;

public class StringTransformerGroup implements StringTransformer {
    private List<StringTransformer> transformers;

    public StringTransformerGroup() {
        this.transformers = new ArrayList<>();
    }

    public StringTransformerGroup(List<StringTransformer> transformers) {
        this.transformers = transformers;
    }
    @Override
    public void execute(StringDrink drink) {
        for (StringTransformer st: transformers) {
            st.execute(drink);
        }
    }


}
