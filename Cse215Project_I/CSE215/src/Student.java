public class Student {
    private String name;
    private int id;
    private double cgpa;

    // ! set registration
    Student() {
        System.out.println("A new student is created");
    }

    setStudent(String name,int id, double cgpa) {
        this.name=name;
        this.id=id;
        this.cgpa=cgpa;
    }

    public void getStudent() {
        System.out.println("Name :" + name);
        System.out.println("id :" + id);
        System.out.println("cgpa :" + cgpa);

    }

    // creating new reg for new student object
    public void makenewReg() {
        Registration s1 = new Registration();

    }

    public void addCourse() {
        // ? this method returns a course object if it is offere in a semester.
        // Todo Hint : Call the addCourse() method of Registration class from this
        // method
    }

    public void dropCourse() {
        // you need to decrease the number of students for that course and delete that
        // course from the array of Course.

    }

    public Registration getRegistration() {
        // return a object of Registration created during makeregistration()
    }

    public void printRegisteredCourse() {
        // will return the course id and course title of all the rgeistered course of a
        // student
    }

    @Override
    public String toString() {
        return "Student [cgpa=" + cgpa + ", id=" + id + ", name=" + name + "]";
    }

}