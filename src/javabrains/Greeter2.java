package javabrains;

public class Greeter2{
    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        Greeting helloWorldGreeting = new HelloWorldGreeting();
        Greeting lambdaGreeting = () -> System.out.println("Hello world!");

        greeter.greet(helloWorldGreeting);
        greeter.greet(lambdaGreeting);

        helloWorldGreeting.perform();
        lambdaGreeting.perform();


        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello world!");
            }
        };

        greeter.greet(lambdaGreeting);
        greeter.greet(innerClassGreeting);



    }
}
