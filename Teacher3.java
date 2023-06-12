import java.util.Scanner;
public class Person {
String name;
String gender;
String address;
int age;
scanner sc=new Scanner(System.in);

Person(String nam,String gen,String add,int ag) {
name=nam;
gender=gen;
address=add;
age=ag;

}
}

public class Employee extends Person {
int empid;
String compname;
String qualifiation;
double salary;

Employee(String nam,String gen,String add,int ag,int eid,String comp,String quali,double sal) {
super(name,gender,address,age);
empid=eid;
compname=comp;
qualification=quali;
salary=sal;

}
}

public class Teacher3 extends Employee {
String subject;
String department;
int teacherid;

Teacher3(String nam,String gen,String add,int ag,int eid,String comp,String quali,double sal,String sub,String dept,int tid) {
super(name,gender,address,age,empid,compname,qualification,salary);
subject=sub;
department=dept;
teacherid=tid;

}
void display() {
System.out.println("Name:" + name);
System.out.println("Gender:" + gender);
System.out.println("Address:" + address);
System.out.println("Age:" + age);
System.out.println("Emp id:" + empid);
System.out.println("Company Name:" + compname);
System.out.println("Qualification:" + qualification);
System.out.println("Salary:" + salary);
System.out.println("Subject:" + subject);
System.out.println("Department:" + department);
System.out.println("Teacher id:" +teacherid);
}

public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("How many teachers details do you want to enter:");
            int a = sc.nextInt();
            Teacher3[] arr=new Teacher3[a];
            for (int i = 0; i <= a; i++) {
                System.out.println("Name:");
                String name = sc.next();
                System.out.println("Gender:");
                String gender=sc.next();
                System.out.println("Address:");
                String address=sc.next();
                System.out.println("Age:");
                String age=sc.next();
                System.out.println("Employee id");
                int empid = sc.nextInt();
                System.out.println("Company Name:");
                String compname=sc.next();
                System.out.println("Qualification:");
                String qualification=sc.next();
                System.out.println("Salary:");
                double salary = sc.nextDouble();
                System.out.println("Subject:");
                String subject = sc.next();
                System.out.println("Department:");
                String department = sc.next();
                System.out.println("Teacher id:");
                String teacherid = sc.next();
                
                arr[i] = new Teacher3(name,gender,address,age,empid,compname,qualification,salary,subject,department,teacherid);
                arr[i].display();
                }
               }
             

                
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               

            


