public class Instructor {

    private int instructorId;
    private String firstName;
    private String lastName;
    private static int instructorIdCounter = 0;


    public Instructor(String firstName, String lastName) {
        this.instructorId = instructorIdCounter;
        instructorIdCounter++;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
