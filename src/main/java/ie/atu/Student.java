package ie.atu;

public class Student {
    public String name;
    public String email;
    public String course;

    public Student() {
        this.name = "";
        this.email = "";
        this.course = "";
    }
    public Student(String name) {
        this.name = "";
        this.email = "";
        this.course = "";
    }

    public Student(String name, String email, String Course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }
}