package vscode.Easy_Level;

public class _11_Matrix_addition {
    public static void main(String[] args) {
        int mat1 [][]={{1,2},
                       {4,3},
                       {12,13}};
        int mat2 [][] = {{7,6},
                        {9,5},
                        {1,7}};
        int sum[][] =new int[3][2];
        int len1 =mat1.length;
        int len2 = mat1[0].length;
       // System.out.println(len1+" "+" ");
        for(int i=0; i<len1; i++){
            for(int j=0; j<len2; j++){
                sum[i][j]=mat1[i][j]+mat2[i][j];
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
