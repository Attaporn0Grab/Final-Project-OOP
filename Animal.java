public abstract class Animal {
    private String name;
    private int age;
    private double weight;


    // constructors
    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getWeight(){
        return weight;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }



    public abstract void eat();
    public abstract void sleep();
    public abstract void makeSound();




}
