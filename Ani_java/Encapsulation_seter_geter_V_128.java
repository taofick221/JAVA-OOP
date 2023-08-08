package Ani_java;

public class Encapsulation_seter_geter_V_128 {
    private String name;
    private int age;
    public void setName(String name){

        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){

        this.age=age;
    }
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        Encapsulation_seter_geter_V_128 ob=new Encapsulation_seter_geter_V_128();
       ob.setName("Taofick");
        System.out.println(ob.getName());
        ob.setAge(22);
        System.out.println(ob.getAge());
    }
}
