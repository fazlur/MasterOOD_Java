public class Zoo {

    public static void main(String[] args) {
        Fish shark1 = new Fish(9, true, 100, false);
        shark1.swim();
        shark1.eat();

        Bird eagle1 = new Bird(3, true, 30, true);
        eagle1.fly();
        eagle1.nesting();

        Animal lion1 = new Animal(12, true, 120);
        Animal lion2 = new Animal(8, false, 99);
        lion1.eat();
        lion2.sleep();
    }


   }
