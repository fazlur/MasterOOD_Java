public class Zoo {

    public static void main(String[] args) {


        Animal sparrow1 = new Sparrow(1, true, 2, true);
        animalMove(sparrow1);

        Flyable flyingBird = new Sparrow(1, true, 2, true);
        flyingBird.fly();

    }

    public static void animalMove(Animal animal) {
        animal.move();

    }


}
