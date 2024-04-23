import java.util.Random;

public class Dog extends Animal{
    Random rand = new Random();
    @Override
    public void makeSound() {
        System.out.println("Woof woof");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void mood() {
        int result = rand.nextInt(2);
        if (result == 1) {
            System.out.println("Dog is excited");
        } else {
            System.out.println("Dog is waving its' tail");
        }
    }
}
