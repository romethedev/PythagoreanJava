import java.lang.Math;
public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        // the hypotenuse is the side across the right angle. 
        // calculate the value of c given legA and legB
        double legC = (legA * legA) + (legB * legB);          //Double leg values
        double squareRoot =  Math.sqrt(legC);       //Square Root the sum of legC
        return squareRoot;                          //Return the result
    }
}
