import java.util.ArrayList;

public class Student {

    private int studentId;
    private String firstName;
    private String lastName;
    private ArrayList<Course> courses = new ArrayList<>();

    private static int studentIdCounter = 0;

    public Student(String firstName, String lastName) {
        this.studentId = studentIdCounter;
        studentIdCounter++;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCourses() {
        StringBuilder coursesString = new StringBuilder();

        for (Course course : courses) {
            coursesString.append(course.getCourseName()).append(", ");
        }
        return "The courses " + firstName + " enrolled in are " + coursesString;
    }

    public void enroll(Course course){
        courses.add(course);
    }
}
