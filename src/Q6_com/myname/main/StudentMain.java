package Q6_com.myname.main;

import Q6_com.myname.exception.InvalidStudentException;
import Q6_com.myname.student.Student;
import java.util.Scanner;

public class StudentMain {
    public Student search(Student[] arr, int roll) throws InvalidStudentException {
        Student s = null;
        for(int i=0;i< arr.length;i++){
            if(arr[i].getRollNo()==roll){
                s=arr[i];
                break;
            }
        }
        if(s==null){
            throw new InvalidStudentException("Student didn't found.");
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n=sc.nextInt();
        Student St[] = new Student[n];
        for(int i=0;i<St.length;i++){
           St[i] = new Student();
            System.out.print("Enter Student Name: ");
           St[i].setName(sc.next());
            System.out.print("Enter Student Roll No.: ");
           St[i].setRollNo(sc.nextInt());
            System.out.print("Enter Student CPI: ");
           St[i].setCPI(sc.nextDouble());
        }
        StudentMain obj = new StudentMain();
        try{
            System.out.print("Enter roll no of the student you want serach: ");
            System.out.println(obj.search(St,sc.nextInt()));
        }
        catch (InvalidStudentException e){
            System.out.println(e.getMessage());
        }
    }
}
