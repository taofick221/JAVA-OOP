package Ani_java;

public class Automatic_type_conversion_V_120 {
    void add(double a,double b){
        System.out.println("Sum :"+ (a+b));
    }
    void add(int a,int b,int c){
        System.out.println("Sum :"+ (a+b+c));
    }
    void add(){
        System.out.println("Nothing for print");
    }

    public static void main(String[] args) {
        Automatic_type_conversion_V_120 ob=new Automatic_type_conversion_V_120();
        ob.add();
        ob.add(10,10);
        ob.add(10,30,20);
    }
}
