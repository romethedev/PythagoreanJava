public class PythagoreanTest {
    public static void main(String[] args) {
        Pythagorean result = new Pythagorean();     //calls back on Pythagorean.java
        double output = result.calculateHypotenuse(3,4);    //Subs in for LegA and LegB
        System.out.println(output);
    }
}
