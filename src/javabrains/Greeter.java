package javabrains;

public class Greeter {
    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();


        MyLambda myLambdaFunction = () -> System.out.println("Hello world");

        greeter.greet(helloWorldGreeting);
        MyAdd addFunction = (a, b) -> a + b;



    }
}

interface MyLambda {
    void foo();
}

interface MyAdd {
    int add(int a, int b);
}
