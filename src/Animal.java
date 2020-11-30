public class Animal{
    int age;
    boolean male;
    int weightInKilos;

    public Animal(int age,
                  boolean male,
                  int weightInKilos) {
        this.age = age;
        this.male = male;
        this.weightInKilos = weightInKilos;

    }

    public void eat() {
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
}
