package vscode.Easy_Level;

import java.util.*;
public class _34_Nth_Odd_number_after_n_odd_numbers {
    public static void main(String[] args){
        /*System.out.print("Enter the N value:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j=1;
        if(n>=4){
            int len = n*n;
            int[] a = new int[len];
            
            for(int i=1; i<len; i++){
                if(i%2==1){
                    a[j]=i;
                    j++;
                }
            }
            System.out.print(n+"th odd number after "+n+" odd numbers:"+a[n*2]);
        }else{
            int len =100;
            int[] a = new int[len];
            for(int i=1; i<len;i++){
                if(i%2==1){
                    a[j]=i;
                    j++;
                }

            }
            System.out.println(n+"th odd number after "+n+" odd numbers:"+a[n*2]);
        }*/
        //ANOTHER METHOD WHICH IS IN PDF
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[100];
        int j=1;
        for(int i=1; i<100;i++){
            if(i%2==1){
                arr[j]=i;
                j++;
            }
        }
        System.out.println("Nth odd number after n odd numbers:"+arr[n*2]);    
    } 
}
