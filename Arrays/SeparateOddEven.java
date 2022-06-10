package Arrays;

import java.util.Scanner;

public class SeparateOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T > 0){
            int N = sc.nextInt();
            int[] A = new int[N];
            for(int i = 0; i < N; i++){
                A[i] = sc.nextInt();
            }
            int[] even = new int[N];
            int[] odd = new int[N];
            for(int i = 0; i < N;i++){
                if(A[i] % 2 == 0){
                    even[i] = A[i];
                }else {
                    odd[i] = A[i];
                }
            }
            for(int j = 0; j < N; j++){
                if(odd[j] != 0){
                    System.out.print(odd[j] + " ");
                }
            }
            System.out.println("");
            for(int j = 0; j < N; j++){
                if(even[j] != 0){
                    System.out.print(even[j] + " ");
                }
            }
            System.out.println("");
            T--;
        }
    }
}
