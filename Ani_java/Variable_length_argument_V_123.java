package Ani_java;

public class Variable_length_argument_V_123 {
    void add(int ... num){
        int sum=0;
        for(int x:num){
            sum=sum+x;
        }
        System.out.println("Sum :"+ (sum));
    }
    void add(){
        System.out.println("Nothing for print");

        Variable_length_argument_V_123 ob= new Variable_length_argument_V_123();

        ob.add(10,10);
        ob.add(10,30,20);
    }
}
