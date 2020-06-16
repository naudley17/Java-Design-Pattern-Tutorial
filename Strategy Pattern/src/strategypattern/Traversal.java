//Making use of decoupling again, separating concepts that varies from one another
package strategypattern;
public interface Traversal {
    String traverse();
}
//concept of the vehicle being used on land
class Land implements Traversal{
    public String traverse(){
        return "Riding down town (land)";
    }
}
//concept of the vehicle being used on water
class Water implements Traversal{
    public String traverse(){
        return "Chilling on the water (water)";
    }
}
//concept of the vehicle being used on air
class Air implements Traversal{
    public String traverse(){
        return "Flying around like superman (air)";
    }
}