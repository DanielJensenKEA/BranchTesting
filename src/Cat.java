import java.util.Random;

public class Cat extends Animal{
    Random rand = new Random();
    @Override
    public void makeSound() {
        System.out.println("Meow meow");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void mood() {
        int result = rand.nextInt(2);
        if (result == 1) {
            System.out.println("Purr purr");
        } else {
            System.out.println("Hiss Hiss");
        }
    }
}
