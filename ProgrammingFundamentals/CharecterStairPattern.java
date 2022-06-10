package ProgrammingFundamentals;

import java.util.Scanner;

public class CharecterStairPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char A = 65;
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= i; j++){
                if(j != i){
                    System.out.print(A + " ");
                }else{
                    System.out.print(A);
                }
            }
            A++;
            System.out.println();
        }
    }
}
