package strategypattern;
public class Vehicle {
    // Basic description stuff
    private String name;
    private String color;
    private double weight;
    private double speed;
    private String sound;
    
    /* Using composition so instead of inheriting functions, the class is
    composed of objects with the right functions */ 
    public Traversal traversalType;
    
    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }
    public void setColor(String newColor){
        color = newColor;
    }
    public String getColor(){
        return color;
    }
    public void setWeight(int newWeight){
        if(newWeight > 0){
            weight = newWeight;
        }
        else{
            System.out.println("Weight must be bigger than 0");
        }
    }
    public double getWeight(){
        return weight;
    }
    public void setSpeed(double newSpeed){
        speed = newSpeed;
    }
    public double getSpeed(){
        return speed;
    }
    public void setSound(String newSound){
        sound = newSound;
    }
    public String getSound(){
        return sound;
    }
    
    /* Example for bad code:
    Methods shouldn't be added to the super class as a difference between
    super class and subclass should be present.
    
    public void land(){
        System.out.println("I sdrive on land")
    }
    public void water(){
        System.out.println("I float on the water")
    }
    public void air(){
        System.out.println("I fly in the air")
    }
    */
    
    /* Vehicle gives the responsibility of finding out how the vehicle
    traverses to traversalType */
    public String tryToTraverse(){
        return traversalType.traverse();
    }
    
    // Just adding the ability to dynamically change traversalType
    public void setTraversalType(Traversal newTraversalType){
        traversalType = newTraversalType;
    }
}
