package Ani_Final_Keyword;

public class Final_Inheritance_use_V_145 {
    String name;
    int id;
    // we use final keyword
   final void display(){
        System.out.println(name);
        System.out.println(id);
    }
}
class Keyword extends Final_Inheritance_use_V_145{
    String university;
    void display1(){
        System.out.println(university);
    }

    public static void main(String[] args) {
        Keyword ob=new Keyword();
        ob.name="Taofick";
        ob.id=847;
        ob.university="Daffodil";
        ob.display();
        ob.display1();
    }
}
