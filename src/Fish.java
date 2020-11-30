public class Fish extends Animal{
    boolean saltwater;

    public Fish(int age, boolean male, int weightInKilos, boolean saltwater) {
        super(age, male, weightInKilos);
        this.saltwater = saltwater;
    }


    public void swim(){
        System.out.println("Swimming");
    }

}
