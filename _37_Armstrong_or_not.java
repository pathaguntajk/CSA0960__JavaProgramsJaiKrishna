package vscode.Easy_Level;

import java.util.*;
import java.lang.Math;
public class _37_Armstrong_or_not {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of digits");
        double x = sc.nextDouble();
        System.out.println("Enter the number:");
        String s = sc.next();
        int n = s.length();
        int sum=0;
        if(n!=(int)x){
            System.out.println("Enter valid input");
        }
        else{
            int num = Integer.parseInt(s);
            int a=num;
            while(a>0){
                int rem = a%10;
                double b = Math.pow(rem,x);
                sum+=b;
                a/=10;
            }
            if(num==sum){
                System.out.println("Armstrong number");
            }else{
                System.out.println("Not Armstrong number");
            }
        }
    }  
}
