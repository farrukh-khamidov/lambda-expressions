package javabrains;

public class TypeInferenceExample {
    public static void main(String[] args) {
        StringLengthLambda myLambda = (String s) -> s.length();
        System.out.println(myLambda.getLength("Hello Lambda"));

        printLambda(s->s.length());
    }

    public static void printLambda(StringLengthLambda lambda) {
        System.out.println(lambda.getLength("Hello lambda"));
    }



    interface StringLengthLambda {
        int getLength(String s);
    }
}
