package Ani_Method_override;
public class Method_override_V_134 {
    String name;
     int age;
    void displayInfo(){
        System.out.println(name);
        System.out.println(age);
    }
}
class Teacher extends Method_override_V_134 {
    String qualification;

    @Override
    void displayInfo() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(qualification);
    }
    public static void main(String[] args) {
        Method_override_V_134 ob=new Method_override_V_134();
        ob.name="Taofick";
        ob.age=22;
        ob.displayInfo();

        Teacher ob1=new Teacher();
        ob1.name="Taofick";
        ob1.age=22;
        ob1.qualification="Bsc";
        ob1.displayInfo();
    }
}



