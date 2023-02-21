package edu.Stolyarov.test;

public class Human {

    private String Name;
    private int salary;
    private int exp;
    private double coef = 0.5;
    private String jobplace;

    //Конструктор!!!!
    public Human(String name,int salary,int exp){
        this.Name = name;
        this.salary=salary;
        this.exp=exp;
    }

    public double calcSalary(){
        return salary*(exp*coef);
    }

    //get set Инкапуляция

    public void setJobplace(String jobplace_name) {
        if (jobplace_name.compareTo("lol") != 0)
            jobplace = jobplace_name;
    }

    public String getname(){
        return Name;
    }

    public String getJobplace(){
        return jobplace;
    }
    ////////////////////////////////////////////////////////////////////

}

