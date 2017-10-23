package dk.niel905g;
/* Exercise 10.9, revise The Course Class as follows:
1) Improve the array to automatically increase array size by creating
 a new larger array and copying the contents of the current array to it.
2) Implement the dropStudent method.
3) Add a clear() method, that removes all students from the course.
4) Write a test program that creates a course, adds three students,
removes one and displays the students in the course. */

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

public class Exercise_10_9 {

    public static void main(String[] args) {
// Creating a new Course with space for more than 100 students,
// using the copyarray method in System class????? No, not good enough!
// To automatically increase as elements are added, we need an ArrayList!.

ArrayList<String> obj = new ArrayList<String>(
        Arrays.asList("Peter Jones, Kim Smith, Anne Kennedy"));
        System.out.println("Elements are:" +obj);

    }
}
