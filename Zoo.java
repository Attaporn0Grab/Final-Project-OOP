public class Zoo {
    public static void main(String[] args) {
        Mammal Something  = new Mammal("mak",20,55,"rad",true) ;
        Something.nurseYoung();
        Something.eat();
        Something.sleep();
        Something.makeSound();
        System.out.println(Something+"\n--------------------");
        Bird birdSomOne = new Bird("Mok",55,1000,6,false);
        birdSomOne.layEggs();
        birdSomOne.eat();
        birdSomOne.sleep();
        birdSomOne.makeSound();
        birdSomOne.fly();
        System.out.println(birdSomOne+"\n--------------------");


        Animal NotKnow = new Bird("asf",20,500, 2, false);


        NotKnow.eat();
        NotKnow.sleep();
        NotKnow.makeSound();
        System.out.println(NotKnow+"\n--------------------");


    }
}
