package animals;
public class Animals {

    public static void main(String[] args) {
            Cat myCat = new Cat();
            Dog myDog = new Dog();
            Snake mySnake = new Snake();
            
            System.out.println("THE DOG");
            myDog.fetch();
            myDog.sound();
            myDog.borf();
            myDog.follow();
            System.out.println();
            
            System.out.println("THE SNAKE");
            mySnake.eatARabbit();
            mySnake.sound();
            mySnake.slither();
            mySnake.follow();
            System.out.println();
            
            System.out.println("THE CAT");
            myCat.scratch();
            myCat.sound();
            myCat.roar();
            myCat.follow();
            System.out.println();
    }
    
}
