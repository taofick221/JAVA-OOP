public class Student {
    private String name;
    private int id;
    private double cgpa;

    public static void main(String[] args) {
        Student stu1=new Student();
        stu1.name="Md taofick";
        stu1.id=221;
        stu1.cgpa=3.5;
        System.out.println("Name of Student-1 :"+stu1.name);
        System.out.println("Id of Student-1:"+stu1.id);
        System.out.println("CGPA of Student-1 :"+stu1.cgpa);

        Student stu2=new Student();
        stu2.name="Md mhgff";
        stu2.id=22;
        stu2.cgpa=4;
        System.out.println("Name of Student-2 :"  +stu2.name);
        System.out.println("Id of Student-2 :"+stu2.id);
        System.out.println("CGPA of Student-2 :"+stu2.cgpa);


    }
}
