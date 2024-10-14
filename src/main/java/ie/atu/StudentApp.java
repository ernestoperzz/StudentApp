
package ie.atu;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class StudentApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        Student firstStudent = new Student();
        System.out.println("Enter student 1 name: ");
        firstStudent.setName(sc.next());

        System.out.println("Enter student 1 email: ");
        firstStudent.setEmail(sc.next());

        System.out.println("Enter student 1 course: ");
        firstStudent.setCourse(sc.next());


        Student secondStudent = new Student();
        System.out.println("Enter student 2 name: ");
        secondStudent.setName(sc.next());

        System.out.println("Enter student 2 email: ");
        secondStudent.setEmail(sc.next());

        System.out.println("Enter student 2 course: ");
        secondStudent.setCourse(sc.next());

        Student thirdStudent = new Student();
        System.out.println("Enter student 3 name: ");
        thirdStudent.setName(sc.next());
        System.out.println("Enter student 3 email: ");
        thirdStudent.setEmail(sc.next());

        System.out.println("Enter student 3 course: ");
        thirdStudent.setCourse(sc.next());

        System.out.println("Student 1:"+firstStudent.toString());
        System.out.println("Student 2:"+secondStudent.toString());
        System.out.println("Student 3:"+thirdStudent.toString());
    }
}