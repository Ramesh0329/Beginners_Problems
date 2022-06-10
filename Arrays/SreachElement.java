package Arrays;

import java.util.Scanner;

public class SreachElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i <= T; i++) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for(int j = 0; j < N; j++){
                A[j] = sc.nextInt();
            }
            int B = sc.nextInt();
            int res = 0;
            for(int j = 0; j < N; j++){
                if(A[j] == B){
                    res = 1;
                }
            }
            System.out.println(res);
        }
    }
}
