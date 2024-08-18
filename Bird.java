public class Bird extends Animal implements Flyable {

    private double wingSpan;
    private boolean canFly;

    public Bird(String name, int age, double weight,double wingSpan, boolean canFly) {
        super(name, age, weight);
        this.wingSpan = wingSpan;
        this.canFly = canFly;
    }
    public double getWingSpan() {
        return wingSpan;

    }
    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }



    public void layEggs(){
        System.out.println("layEggs : yaa can ");
    }


    @Override
    public void eat() {
        System.out.println("Bird what eat : not know monn");

    }

    @Override
    public void sleep() {
        System.out.println("Bird sleep: not know naa");

    }

    @Override
    public void makeSound() {
        System.out.println("Bird makeSound: halll  lowww ");

    }

    @Override
    public void fly() {
        System.out.println("Bird fly: pay pay pay pay pay ");

    }

    public  String toString(){

        return ("Brid :  "+ super.getName() + "  age :"+super.getAge()+" weight "+  getWeight() + ", wingSpan  " + wingSpan + ", canFly  " + canFly);
    }
}
