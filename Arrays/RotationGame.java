package Arrays;

import java.util.Scanner;

public class RotationGame {
    public static void rotate(int[] A, int low, int high){
        while(low < high){
            int temp = A[low];
            A[low] = A[high];
            A[high] = temp;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        B = B % N;
        rotate(A,0, N-1);
        rotate(A,0, B-1);
        rotate(A, B, N-1);
    }
}
