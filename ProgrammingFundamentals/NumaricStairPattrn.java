package ProgrammingFundamentals;

import java.util.Scanner;

public class NumaricStairPattrn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++){
            int value = 1;
            for(int j = 1; j <= i; j++){
                if(j != i){
                    System.out.print(value + " ");
                    value++;
                }else{
                    System.out.print(value);
                }
            }
            System.out.println();
        }
    }
}
