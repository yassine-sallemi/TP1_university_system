public class Main {
    public static void main(String[] args) {
        Instructor instructor1 = new Instructor("Rami", "Mrad");
        Instructor instructor2 = new Instructor("Issam", "Allani");

        Student student1 = new Student("Yassine","Sallemi");

        Course course1 = new Course("Java",instructor2);
        Course course2 = new Course("C", instructor1);

        student1.enroll(course1);
        student1.enroll(course2);

        System.out.println(student1.getCourses());
    }
}