package Arrays;

import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int y = sc.nextInt();
        for(int i = 0; i < N; i++){
            if(i == x-1){
                System.out.print(y + " " + A[i] + " ");
            }else{
                System.out.print(A[i] + " ");
            }
        }
    }
}
