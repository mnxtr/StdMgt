// project details @ https://drive.google.com/file/d/1QCT_ZLVO1s9UJCoJlAYuOZWbkkiyWx05/view
// ** Each course consists of id, title, credit, tuition per credit, number of students, and
// ** seat capacity.
public class Course {
    private String id;
    private String title;
    private int credit;
    private int tuitionPerCredit;
    private int numOfStudent;
    private int seatCapacity = 3;

    Course(String id, String title, int credit, int tuitionPerCredit) {
        this.id = id;
        this.title = title;
        this.credit = credit;
        this.tuitionPerCredit = tuitionPerCredit;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getTuitionPerCredit() {
        return tuitionPerCredit;
    }

    public void setTuitionPerCredit(int tuitionPerCredit) {
        this.tuitionPerCredit = tuitionPerCredit;
    }

    public int getNumOfStudent() {
        return numOfStudent;
    }

    public void setNumOfStudent(int numOfStudent) {
        this.numOfStudent = numOfStudent;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    @Override
    public String toString() {
        return "Course [credit=" + credit + ", id=" + id + ", numOfStudent=" + numOfStudent + ", seatCapacity="
                + seatCapacity + ", title=" + title + ", tuitionPerCredit=" + tuitionPerCredit + "]";
    }

}
