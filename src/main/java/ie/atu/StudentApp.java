
package ie.atu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class StudentApp {
    public static void main(String[] args){
        Student firstStudent = new Student();
        firstStudent.setName("Paul");
        firstStudent.setEmail("paul@atu.ie");
        firstStudent.setCourse("Engineering");

        System.out.println(firstStudent.toString());

        Student secondStudent = new Student("Dave");

        Student thirdStudent = new Student("Bear","bear@atu.ie","medicine");
    }
}