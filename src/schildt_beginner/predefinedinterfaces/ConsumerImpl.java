package schildt_beginner.predefinedinterfaces;

public class ConsumerImpl implements java.util.function.Consumer<Integer> {
    @Override
    public void accept(Integer o) {
        System.out.println(o);
    }
}
