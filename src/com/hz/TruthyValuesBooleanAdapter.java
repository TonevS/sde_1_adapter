package com.hz;


import java.util.Arrays;
import java.util.List;

public class TruthyValuesBooleanAdapter implements BooleanAdapter{
    private ConsoleReader adaptee;

    private List<String> truthyValues;

    public  TruthyValuesBooleanAdapter(ConsoleReader reader) {
        this.adaptee = reader;

        String[] truthyWords = new String[] {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};
        this.truthyValues = Arrays.asList(truthyWords);
    }


    @Override
    public boolean readLineBoolean() {
        String line = this.adaptee.readLine();

        return this.truthyValues.contains(line);
    }
}
