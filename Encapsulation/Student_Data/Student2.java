package Encapsulation.Student_Data;

public class Student2 
{
    
    private String name;
    private int roll;
    private double per;

    public void setStudentData(String n, int r, double p)
    {
        if(r <= 0) System.out.println("Roll number cannot be Negative");
        else roll = r;
        
        name = n;
        per = p;
    }

    public void showStudentData()
    {
        System.out.println("Name : " + name + ", " + "Roll : " + roll + ", " + "Per : " + per);
    }
}
