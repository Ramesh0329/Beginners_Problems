package Arrays;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < N; i++){
            if(A[i] > max){
                max  = A[i];
            }
            if(A[i] < min){
                min = A[i];
            }
        }
        System.out.print(max +" " + min);
    }
}
