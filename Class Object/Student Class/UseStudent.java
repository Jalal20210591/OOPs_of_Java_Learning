public class UseStudent {  // Driver Class

    public static void main(String[] arg) {

        /*
         Create Object
         1. Creating object ref
            = <class_name> <obj_ref>;

         2. Creating actual Object
            <obj_ref> = new <class_name>();

            Student s;
            s = new Student();
            (OR)
            Student s1 = new Student();
         */

        // Object creating
        // Student s = new Student();

        Student s;  // --> Stack memory te thake
        s = new Student();

        s.roll = 10;
        s.name = "Amit";
        s.per = 84.5;

        System.out.println("Roll = "+s.roll);
        System.out.println("Name = "+s.name);
        System.out.println("Per = "+s.per);

    }

}
