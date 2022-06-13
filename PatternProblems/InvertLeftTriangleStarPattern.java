package PatternProblems;

import java.util.Scanner;

public class InvertLeftTriangleStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++){
            for(int j = 1; j < i; j++){
                System.out.print("  ");
            }
            for(int k = i; k <= N; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
