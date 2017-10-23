package dk.niel905g;
/** Hjemmeopgave 10.1 (The Time Class) Bestående af TestTime.java samt Time.java
 */
public class Time {
    // Declaring the variables
        public long hour;
        public long minute;
        public long second;

        public Time() {
            // Creating a no-arg Constructor:
            long totalSeconds = System.currentTimeMillis() / 1000;
            long totalMinutes = totalSeconds / 60;
            long totalHours = totalMinutes / 60;
            this.hour = totalHours % 24;
            this.minute = totalMinutes % 60;
            this.second = totalSeconds % 60;
        }
            // Constructor
        public Time(long hour, long minute, long second) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
            // Time Object:
        public Time(long elapseTime) {
            long totalSeconds = elapseTime / 1000;
            long totalMinutes = totalSeconds / 60;
            long totalHours = totalMinutes / 60;
            this.hour = totalHours % 24;
            this.minute = totalMinutes % 60;
            this.second = totalSeconds % 60;
        }
            // Three Getters for each, hour, minute and seconds;
        public long getHour() {
            return hour;
        }
        public long getMinute() {
            return minute;
        }
        public long getSecond() {
            return second;
        }
    }
