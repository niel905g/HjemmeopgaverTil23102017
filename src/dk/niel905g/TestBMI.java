package dk.niel905g;
/* Hjemmeopgave 10.2 bestående af BMI.java & TestBMI.java */

public class TestBMI {
    public static void main(String[] args) {

        BMI p = new BMI("Niels", 62, 180, 6, 1);
        System.out.printf("Name: %s Age: %d weight: %.2f feet: %.2f inches: %.2f\n",
                p.getName(), p.getAge(), p.getWeight(), p.getFeet(), p.getInches());
    }
}
