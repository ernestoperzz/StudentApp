
package ie.atu;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class StudentApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        Student firstStudent = new Student();
        System.out.println("Enter student name: ");
        firstStudent.setName(sc.next());

        System.out.println("Enter student email: ");
        firstStudent.setEmail(sc.next());

        System.out.println("Enter student course: ");
        firstStudent.setCourse(sc.next());


        Student secondStudent = new Student("Dave");
        System.out.println("Enter student name: ");
        secondStudent.setName(sc.next());

        System.out.println("Enter student email: ");
        secondStudent.setEmail(sc.next());

        System.out.println("Enter student course: ");
        secondStudent.setCourse(sc.next());
        Student thirdStudent = new Student("Bear","bear@atu.ie","medicine");
        System.out.println("Enter student name: ");
        thirdStudent.setName(sc.next());
        System.out.println("Enter student email: ");
        thirdStudent.setEmail(sc.next());

        System.out.println("Enter student course: ");
        thirdStudent.setCourse(sc.next());

    }
}