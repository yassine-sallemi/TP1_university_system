public class Course {
    private int courseId;
    private String courseName;
    private Instructor instructor;
    private static int courseIdCounter = 0;

    public Course(String courseName, Instructor instructor) {
        this.courseId = courseIdCounter;
        courseIdCounter++;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }
}
