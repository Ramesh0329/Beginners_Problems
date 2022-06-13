package PatternProblems;

import java.util.Scanner;

public class PyramidStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++){
            for(int j = i; j < N; j++){
                System.out.print("  ");
            }
            for(int k = 1; k <= i; k++){
                if(k == i){
                    System.out.print("*");
                }else{
                    System.out.print("* " + "  ");
                }
            }
            System.out.println();
        }
    }
}
