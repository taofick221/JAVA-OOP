package Ani_Inheritance;

////Problem-1:
//public class Inheritance {
//    float salary=4000;
//
//}
//class Programmer extends Inheritance{
//    float bonus=1000;
//    public static void main(String args[]){
//        Programmer p=new Programmer();
//        System.out.println("Programmer salary is:"+p.salary);
//        System.out.println("Bonus of Programmer is:"+p.bonus);
//    }
//}

//Problem-2:

public class Inheritance_part1 {
    int z;
    public void addition(int a,int b){
        z=a+b;
        System.out.println("The sum:"+z);
    }
    public void subtraction(int a,int b){
        z=a-b;
        System.out.println("The subtraction:"+z);
    }
}
class Myclculator extends Inheritance_part1 {


    public void multiplication(int a,int b){
        z=a*b;
        System.out.println("The multiplication:"+z);
    }
    public void division(int a,int b){
        z=a/b;
        System.out.println("The division:"+z);

    }
    public static void main(String[] args) {
        int a=20,b=10;
        Myclculator demo=new Myclculator();
        demo.addition(a,b);
        demo.subtraction(a,b);
        demo.multiplication(a,b);
        demo.division(a,b);



    }

}
