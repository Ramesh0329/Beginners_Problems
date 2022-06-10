package Arrays;

import java.util.Scanner;

public class DifferenceBtwEvenandOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i <= T; i--){
            int N = sc.nextInt();
            int[] A = new int[N];
            for(int j = 0; j < N; j++){
                A[j] = sc.nextInt();
            }
            int countEven = 0;
            int countOdd = 0;
            int result = 0;
            for(int k = 0; k < N;k++){
                if(A[k] % 2 == 0){
                    countEven++;
                }else{
                    countOdd++;
                }
                result = countEven - countOdd;
            }
            System.out.println(result);
        }
    }
}
