package Ani_java;

public class Factorial_using_Recursion_V_125 {
    int fact(int n){
        if(n==1)
            return 1;
        else
            return n*fact(n-1);
    }
    public static void main(String[] args) {
        Factorial_using_Recursion_V_125 ob= new Factorial_using_Recursion_V_125();
        int result =ob.fact(5);
        System.out.println(result);
    }
}
