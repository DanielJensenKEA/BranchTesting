public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        cat.eat("fish");
        dog.eat("meat");

        cat.mood();
        dog.mood();
    }
}
