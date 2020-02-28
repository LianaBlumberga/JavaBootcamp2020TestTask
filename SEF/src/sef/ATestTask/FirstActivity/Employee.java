package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    //default constructor
    public Employee() {
        System.out.println("Thia is default constructor");
    }

    //parametrized constructor
    public Employee(int empId, String jobTitle, String companyName, int salary ){
        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }


    //TODO 2 add getters and setters

    // 4 getters
    public String getJobTitle(){
        return jobTitle;
    }

    public int getEmpId(){
        return empId();
    }

    public String getCompanyName(){
        return companyName;
    }

    public double getSalary(){
        return salary;
    }

   // 4 setters
   public void setEmpId(int empId){
        this.empId = empId;
   }

    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }

    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    //TODO 3 override method announce()

    public String announce(){
        System.out.println( "I am working as " + getJobTitle() + " in " = getCompanyName() + ".");
    }

}

      }