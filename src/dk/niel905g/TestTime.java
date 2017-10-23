package dk.niel905g;

/** Hjemmeopgave 10.1 (The Time Class) Bestående af TestTime.java samt Time.java
 */
public class TestTime {

    public static void main(String[] args) {

        Time time = new Time(555550000);
        System.out.println(time.hour + ":" + time.minute + ":" + time.second);
    }
}
