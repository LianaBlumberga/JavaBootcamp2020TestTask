package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person{

    //Attributes
    private int grade;
    private String schoolName;
    private String firstName;

    //Behavior - default constructor
    public Student(){
        System.out.println("This is studen'ts constructor");
    }

    // getter for int grade
    public int getGrade() {
        return grade;
    }

    // setter for int grade
    public void setGrade(int grade) {
        this.grade = grade;
    }

    // getter for String schoolName
    public String getSchoolName() {
        return schoolName;
    }

    // setter for String schoolName
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void announce(){
        super.public.String announce();  // calls announce() method of Person class
        System.out.println("I study at " + getSchoolName());
    }

}
