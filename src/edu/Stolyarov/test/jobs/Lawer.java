package edu.Stolyarov.test.jobs;

import edu.Stolyarov.test.Employee;

public class Lawer extends Employee {
    private String departament;

    public Lawer(String fullname, long date, long salary, String departament_name){
        super(fullname,date,salary);
        this.departament = departament_name;
    }
}
