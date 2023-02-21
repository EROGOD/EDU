package edu.Stolyarov.test;

import edu.Stolyarov.test.javarush.task0142;
import edu.Stolyarov.test.jobs.Doctor;
import edu.Stolyarov.test.jobs.Lawer;

public class Main {
    public static void main(String[] args) {

        //Вызов из других классов//
        System.out.println("Hello world!");

        Human human1 = new Human("Stive", 100, 3); //new - это создание новой ссылки на экземпляр класса!
        Human human2 = new Human("Bob", 150, 5);

        System.out.println(human1.calcSalary());
        System.out.println(human2.calcSalary());
        ///////////////////////////////////////
        //Инкапсуляция//
        human1.setJobplace("Driver");

        System.out.println("Name is: " + human1.getname());
        System.out.println("Job is: " + human1.getJobplace());

        //////////////////////////

        //Наследование//
        Doctor doc1 = new Doctor("Jack", 1234, 10000000, 1);
        Lawer law1 = new Lawer("Petr", 1234, 20000000, "Crime");

        System.out.println(doc1.getmFullName() + " has a salary in the amount of: " + doc1.getSalaryRub() + " Rubles");
        System.out.println(law1.getmFullName() + " has a salary in the amount of: " + law1.getSalaryRub() + " Rubles");

        double totalSalary = doc1.getSalaryRub() + law1.getSalaryRub();

        System.out.println("Total salary = " + totalSalary);
        /////////////////////////

        //Полиморфизм

        Employee[] emps = new Employee[3]; //создание массива

        emps[0] = new Doctor("Vasya", 1233, 10000000, 1);
        emps[1] = new Lawer("Kirill", 1236, 10000000, "Crime");
        emps[2] = new Lawer("Stepa", 1236, 20000000, "Marry");

        double totalSalary2 = 0;

        for (int i=0; i<emps.length;i++) //цикл for в Java (откуда, до куда, сумма шага)
            totalSalary2 +=emps[i].getSalaryRub();

        System.out.println("Total salary 2 = " + totalSalary2);

        task0142 amigo = new task0142();

        System.out.println(amigo.amigo());
    }
}