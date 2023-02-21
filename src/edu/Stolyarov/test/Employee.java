package edu.Stolyarov.test;

public class Employee {
    private String mFullName;
    private long mEmployementDate;
    protected long mSalary; //Полиформизм - нужно для переменной, которая используется в перегруженной ф-ции в дочернем классе,
    // проставить protected

    public Employee(String fullname1, long date, long salary){
        this.mFullName = fullname1;
        this.mEmployementDate = date;
        this.mSalary = salary;
    }

    public double getSalaryRub(){
        return mSalary/100f;
    }

    public String getmFullName(){
        return mFullName;
    }
}
