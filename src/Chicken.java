public class Chicken extends Bird {
    public Chicken(int age, boolean male, int weightInKilos, boolean fly) {
        super(age, male, weightInKilos, fly);
    }

    //Overriding fly method originally implemented in Bird class
    public void fly(){
        System.out.println("Chicken not able to fly");
    }
}
