public class Bird extends Animal{
    boolean fly;

    public Bird(int age, boolean male, int weightInKilos, boolean fly) {
        super(age, male, weightInKilos);
        this.fly = fly;
    }

    public void nesting(){
        System.out.println("Nesting...");
    }

    @Override
    public void move() {
        System.out.println("Flapping wings...");
    }
}
