package strategypattern;
public class Ship extends Vehicle{
    public Ship(){
        super();
        setSound("VWOOOOOOOOOOSH");
        
        /* Setting the Traversal interface polymorphically, in this case it
        sets the behavior of this vehicle as a land vehicle */
        traversalType = new Water();
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