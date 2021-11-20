Q.1 Create two threads and assign names ‘Scooby’ and ‘Shaggy’ to the two threads. Display both thread names.


Q.2 store colours in the form of an array
ex: String colours[]={"white","blue","black","green","red","yellow"};
display all colours repeatedly by generating colour index from Random class.
If the random colour index matches to red stop display.
Note: perform this task by implementing Runnabe interface


Q.3 Create a thread which prints 1 to 10. After printing 5, there should be a delay of 5000 milliseconds before printing 6.
( Thread Control Mechanism concept)


Q.4 Create two threads, one thread to display all even numbers between 1 & 20, another to display odd numbers between 1 & 20.
Note: Display all even numbers followed by odd numbers
Hint: use join. (use of join method and thread control mechanism)


Q.5 Create three threads- with different priorities – MAX, MIN, NORM- and start the threads at the same time.
Observe the completion of the threads. (Thread priorities concept)


Q.6 A program to demonstrate custom exceptions. Create a com.myname.stuent.Student class with three private fields name, rollNo, & CPI.
Create Getter and Setter for all the fields,
override the public String toString() method of Object class, to represent Student objects as String.
Create a com.myname.main.StudentMain class which is the implementation class contains main method and a search() method.
main method will create a list of students i.e array and initialize each objects by taking input from user using java.util.Scanner class.
This method will also call search method and print the result.
search() method will accept two arguments first is Student[] list and int rollNo.
This method will return Student object if rollNo matches with any of the Student object
or else it will throw an user defined exception InvalidStudentException.
com.myname.exception.InvalidStudentException is a class which extends java.lang.Exception class and
have one parameterized constructor which accept an argument String message.