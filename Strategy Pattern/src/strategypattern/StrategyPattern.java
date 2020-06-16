package strategypattern;
public class StrategyPattern {
    public static void main(String[] args) {
        Vehicle Batmobile = new Car();
        Vehicle Titanic = new Ship();
        Vehicle AirForceOne = new Plane();
        
        System.out.println("Batmobile: " + Batmobile.tryToTraverse());
        System.out.println("Titanic: " + Titanic.tryToTraverse());
        System.out.println("Air Force One: " + AirForceOne.tryToTraverse());
        
        // If Dick Grayson turns on flight mode
        Batmobile.setTraversalType(new Air());
        System.out.println("Batmobile: " + Batmobile.tryToTraverse());
    }
}
