import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numx = 0;
        int numy = 0;
        int[][] bingo = new int[3][3];
        while (numx < 3) {
            while(numy < 3) {
                int nextNum = sc.nextInt();
                bingo[numx][numy] = nextNum;
                numy++;
            }
            numx++;
            numy=0;
        }

        int bingoNum = sc.nextInt();
        List<Integer> numList = new ArrayList<>();
        while(bingoNum > 0) {
            int nextNum = sc.nextInt();
            numList.add(nextNum);
            bingoNum--;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (numList.contains(bingo[i][j])) {
                    bingo[i][j] = 1000;
                }
            }
        }

        if (
                (bingo[0][0]==1000 && bingo[0][1]==1000 && bingo[0][2]==1000) ||
                        (bingo[1][0]==1000 && bingo[1][1]==1000 && bingo[1][2]==1000) ||
                        (bingo[2][0]==1000 && bingo[2][1]==1000 && bingo[2][2]==1000) ||
                        (bingo[0][0]==1000 && bingo[1][0]==1000 && bingo[2][0]==1000) ||
                        (bingo[0][1]==1000 && bingo[1][1]==1000 && bingo[2][1]==1000) ||
                        (bingo[0][2]==1000 && bingo[1][2]==1000 && bingo[2][2]==1000) ||
                        (bingo[0][0]==1000 && bingo[1][1]==1000 && bingo[2][2]==1000) ||
                        (bingo[0][2]==1000 && bingo[1][1]==1000 && bingo[2][0]==1000)

        ) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
