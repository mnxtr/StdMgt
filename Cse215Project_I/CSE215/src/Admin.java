//**The university has an admin who manages the courses offered in a semester and
//**publishes the offered courses list to the students. The admin can increase the seat
//**capacity of a specific course, and can see the status (how many students registered for
//**that course, its seat capacity, etc. ) of any of the courses. **//

// Todo : Constructors,
public class Admin {
    public void offerCourse(Course course) {

        CurrentOfferedCourse add = new CurrentOfferedCourse();
        add.addcourse(course);

        // this method will add a course in the current offered courses list.
    }

    public void publishOfferedCourse() {
        System.out.println();
        // it will print all the courses offered in a semester with course id

    }

    public void increaseSeatCapacity(Course course, int size) {
        // this method will increase the seat capacity of a specified course by that
        // size.
    }

    public void seeCourseStatus() {
        // it will print all the offered courses with course id, number of students
        // enrolled in and seat capacity of that course.
    }

}