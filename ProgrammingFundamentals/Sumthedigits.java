package ProgrammingFundamentals;

import java.util.Scanner;

public class Sumthedigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            int N = sc.nextInt();
            int sum = 0;
            while(N != 0){
                int reminder = N % 10;
                sum += reminder;
                N = N/10;
            }
            System.out.println(sum);
        }
    }
}
