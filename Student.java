
// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student's info.
// ****************************************************************
import java.util.Scanner;
public class Student
{
    //declare instance data
    String name;
    int score1;
    int score2;
    double average;
    Scanner scan = new Scanner(System.in);
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
        //add body of constructor
        this.name = studentName;
    }
    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
        //add body of inputGrades
        System.out.println("Enter "+ this.name +"/'s score for test1");
        score1 = scan.nextInt();
        System.out.println("Enter "+ this.name +"/'s score for test2");
        score2 = scan.nextInt();
    }
    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    public Double getAverage(){
        return    ((double)score1+score2)/2.0;
    }
    //-----------------------------------------------
    //getName: return the student's name
    //-----------------------------------------------
    //add header for 
    public String getName()
        {
            return this.name;
        }
        //-----------------------------------------------
        //printName: print the student's name
        //-----------------------------------------------
        //add header for printName
    public void printName()
        {
         System.out.println(this.name);
    }
    }