public class Sparrow extends Bird implements Flyable {
    public Sparrow(int age, boolean male, int weightInKilos, boolean fly) {
        super(age, male, weightInKilos, fly);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow flying high...");
    }
}
