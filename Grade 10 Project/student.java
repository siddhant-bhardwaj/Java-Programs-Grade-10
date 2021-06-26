/*Define a class student described below: 

Data members:

name, age, m1, m2, m3, max, avg

Member method:

A parameterized constructor to initialize data members.

To accept details of a students

To compute average and maximum out of 3 marks.

To display marksheet with all the details

Write a main method to create object and call above methods.*/


import java.util.*;
class student {
    
     String name;
     int age;
     int m1,m2,m3,max;
     double avg;
     
    student(String Name, int Age, int M1, int M2, int M3)
    {
    name=Name;
    age=Age;
    m1=M1;
    m2=M2;
    m3=M3;
    }
    
    void accept()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your name");
    name=sc.nextLine();
    System.out.println("Enter your age ");
    age=sc.nextInt();
    System.out.println("Enter your marks (m1,m2 and m3 respectively) ");
    m1=sc.nextInt();
    m2=sc.nextInt();
    m3=sc.nextInt();
    student obj = new student(name,age,m1,m2,m3);
    }
    
    void calculate()
    {
    avg=(m1+m2+m3)/3;
    if(m1>m2 && m1>m3)
    {
    max=m1;
    }
    if(m2>m1 && m2>m3)
    {
    max=m2;
    }
    if(m3>m1 && m3>m2)
    {
    max=m3;
    }
    }
    
    void display()
    {
    System.out.println(name);
    System.out.println(age);
    System.out.println(avg);
    System.out.println(max);
    }
     
    void main()
    {
    student obj=new student();
    obj.accept();
    obj.calculate();
    obj.display();
    }
    
}
