package vscode.Easy_Level;


import java.util.Scanner;
public class _17_Composite_Numbers_between_A_and_B {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a, b;
        System.out.println("Enter the start value:");
        a=sc.nextInt();
        System.out.println("Enter the end value:");
        b=sc.nextInt();
        System.out.println("Composite numbers:");
        for(int i=a+1; i<b; i++){
            int cc=0;         //composite count
            for(int j=1; j<=b; j++){
                if(i%j==0){
                    cc+=1;
                }
            }
            if(cc>2){            //factors greater than 2
                System.out.print(i+" ");
            }
        }
   }
}

    