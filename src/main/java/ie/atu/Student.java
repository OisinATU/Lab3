package ie.atu;

// Define Class
public class Student {

    // Define Attributes
    String name, email, course;

    public Student(String name, String email, String course) {
        this.name = name;
        this.email = email;
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

    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setCourse(String course) {
        this.course = course;
    }


    // Override toString
    @Override
    public String toString() {
        return "Student{name='" + name + "', email='" + email + "', course='" + course + "'}";
    }

}
