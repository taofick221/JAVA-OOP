package Ani_java;

import java.text.DecimalFormat;

public class Deci_Num_formatting_V163 {
    public static void main(String[] args) {
        DecimalFormat ob= new DecimalFormat("0.0000");
        double x=2.6542817;
        System.out.println("x= "+ob.format(x));
    }
}
