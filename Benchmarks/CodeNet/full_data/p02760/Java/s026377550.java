import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] card = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                card[i][j] = sc.nextInt();
            }
        }

        int n = sc.nextInt();
        int[] appears = new int[n];
        for (int i = 0; i < n; i++) appears[i] = sc.nextInt();
        
        boolean[][] bingo = new boolean[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < n; k++) {
                    if (card[i][j] == appears[k]) bingo[i][j] = true;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            if (bingo[i][0] && bingo[i][1] && bingo[i][2]) {
                System.out.println("Yes");
                return;
            }
        }
        for(int i = 0; i < 3; i++) {
            if(bingo[0][i] && bingo[1][i] && bingo[2][i]) {
                System.out.println("Yes");
                return;
            }
        }
        if(bingo[0][0] && bingo[1][1] && bingo[2][2]) {
            System.out.println("Yes");
            return;
        }
        if(bingo[0][2] && bingo[1][1] && bingo[2][0]) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}