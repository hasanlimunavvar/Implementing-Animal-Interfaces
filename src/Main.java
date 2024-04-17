import model.*;

public class Main {
    public static void main(String[] args) {

        Flyable bat = new Bat();
        Swimmable fish = new Fish();
        Flyable bird = new Bird();

        bat.fly();
        fish.swim();
        bird.fly();




    }
}