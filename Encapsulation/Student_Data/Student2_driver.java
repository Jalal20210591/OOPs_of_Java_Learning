package Encapsulation.Student_Data;

public class Student2_driver {
    
   public static void main(String[] args) {
    
        Student2 jalal = new Student2();
        Student2 kamal = new Student2();

        jalal.setStudentData("Jalal Uddin Bhuiyan", 111225096, 85.45);
        kamal.setStudentData("Kamal Hossen", 111225095, 78.33);

        jalal.showStudentData();
        kamal.showStudentData();
        

   }


}
