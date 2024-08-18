public class Mammal extends Animal{

    private String furColor;
    private boolean isDomestic;

    public Mammal(String name, int age, double weight,String furColor, boolean isDomestic ){
        super(name, age, weight);
        this.furColor = furColor;
        this.isDomestic = isDomestic;
    }

    public String getFurColor(){
        return furColor;
    }

    public void setFurColor(String furColor){
        this.furColor = furColor;
    }
    public boolean getisDomestic(){
        return isDomestic;
    }
    public void setisDomestic(boolean domestic){
        isDomestic = domestic;
    }

    public void  nurseYoung(){

        System.out.println("nurseYoung : thing can Naa");

    }


    @Override
    public void eat() {
        System.out.println("Mammal what eat :not know naa");

    }

    @Override
    public void sleep() {
        System.out.println("Mammal sleep: just now");

    }

    @Override
    public void makeSound() {
        System.out.println("Mammal makeSound: hi ");

    }
    public String toString(){

        return ("Mammal :"  + super.getName() + "age :"+super.getAge()+" weight "+  getWeight() + " furColor: " + furColor + " isDomestic: " + isDomestic);
    }
}
