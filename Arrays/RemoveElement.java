package Arrays;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] B = new int[N];
        for(int i = 0; i < N; i++){
            B[i] = sc.nextInt();
        }
        int X = sc.nextInt();
        for(int i = 0; i < N; i++){
            if(i == X-1){
                continue;
            }else{
                System.out.print(B[i] + " ");
            }
        }
    }
}
