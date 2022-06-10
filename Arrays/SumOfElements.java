package Arrays;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < N; i++){
            sum += A[i];
        }
        System.out.println(sum);
    }
}
