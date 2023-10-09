public class Q14Student {
    private String name;
    private String studentID;
    private String degreeProgramme;

    // constructor
    public Q14Student(String name, String studentID, String degreeProgramme) {
        this.name = name;
        this.studentID = studentID;
        this.degreeProgramme = degreeProgramme;
    }

    // return the formatted string
    public String toString() {
        return "[" + name + ", ID: " + studentID + ", " + degreeProgramme + "]";
    }
}
