package strategypattern;
public class Car extends Vehicle{
    public Car(){
        super();
        setSound("VROOOOOOOOOOOM");
        
        /* Setting the Traversal interface polymorphically, in this case it
        sets the behavior of this vehicle as a land vehicle */
        traversalType = new Land();
    }
    
    /* Example for bad code:
    Another way we could do it is by overriding the traverse method but its
    bad practice as this would couple the class Dog with the traverse method
    which may cause conflicts when the traverse method is changed down the
    line
    
    public void traverse(){
        System.out.println("I like asphalt, do you like asphalt?");
    }
    public void traverse(){
        System.out.println("I prefer water, keeps getting me wet tho");
    }
    public void traverse(){
        System.out.println("Y'all losers, the air is where it's at");
    } */
}
