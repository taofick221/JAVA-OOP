public class Methods {
    private String name;
    private int id;
    private double cgpa;
    void displayinfo(){
        System.out.println("Name  :"  +name);
        System.out.println("Id :"+id);
        System.out.println("CGPA  :"+cgpa);
    }

    public static void main(String[] args) {
        Methods stu1=new Methods();

        stu1.name="Md taofick";
        stu1.id=221;
        stu1.cgpa=3.5;
        stu1.displayinfo();


        Methods stu2=new Methods();

        stu2.name="Md mhgff";
        stu2.id=22;
        stu2.cgpa=4;
        stu2.displayinfo();




    }
}

//Practice code -------------------->
//public class Methods {
//    private String name;
//    private String id;
//    private double cgpa;
//
//    public void displayinfo()
//    {
//        System.out.println("The student Name:"+name);
//        System.out.println("The student id:"+id);
//        System.out.println("The student Cgpa:"+cgpa);
//        System.out.println("\n\n");
//    }
//    public static void main(String[] args) {
//        Methods stu1= new Methods();
//        stu1.name="Taofick";
//        stu1.id="221";
//        stu1.cgpa=3.5;
//        stu1.displayinfo();
//
//        Methods stu2= new Methods();
//        stu2.name="Taofick4444444";
//        stu2.id="221457";
//        stu2.cgpa=3.544444;
//        stu2.displayinfo();
//    }
//}