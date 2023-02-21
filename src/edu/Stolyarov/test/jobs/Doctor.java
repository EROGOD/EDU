package edu.Stolyarov.test.jobs;

import edu.Stolyarov.test.Employee;

import javax.print.Doc;

public class Doctor extends Employee {
    private int mCategory;

    public Doctor(String fullname, long date, long salary, int category){
        super(fullname,date,salary);
        this.mCategory = category;
    }

    //Полиморфизм
    @Override //нужно указать такое же название ф-ции, что и в родительском классе
    public double getSalaryRub(){
        return mSalary/100f * 1.2;
    }
}
