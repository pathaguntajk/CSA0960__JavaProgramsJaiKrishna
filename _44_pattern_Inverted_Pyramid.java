package vscode.Easy_Level;

import java.util.*;
public class _44_pattern_Inverted_Pyramid {
    public static void main(String[] args){
        System.out.println("Enter rows:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int k=1; k<i; k++){
                System.out.print(" ");
            }
            for(int j=0; j<=n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    
}
