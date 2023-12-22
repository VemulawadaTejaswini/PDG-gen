import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N;
        int[][] Bingo = new int[3][3];
        boolean[][] Check_Bingo = new boolean[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Bingo[i][j] = sc.nextInt();
            }
        }
        N = sc.nextInt();
        int[] ArrN = new int[N];
        for (int i = 0; i < N; i++) {
            ArrN[i] = sc.nextInt();
            //danh dau vao o Check_Bingo nhung noi gia tri mang Arr trung voi gia tri mang Bingo
            for(int j = 0 ; j < 3 ; j++)
            {
                for(int k = 0 ; k < 3; k++)
                {
                    if(ArrN[i] == Bingo[j][k])
                    {
                        Check_Bingo[j][k] = true;
                    }
                }
            }
        }
        //3 th bingo o hang ngang va hang doc
        for(int i = 0 ; i < 3 ; i++)
        {
            if(Check_Bingo[i][0] == true && Check_Bingo[i][1] == true && Check_Bingo[i][2] == true)
                Exit_bingo();
            else if(Check_Bingo[0][i] == true && Check_Bingo[1][i] == true && Check_Bingo[2][i] == true)
                Exit_bingo();
        }
        if(Check_Bingo[2][2] == true && Check_Bingo[1][1] == true && Check_Bingo[0][0] == true) Exit_bingo();
        else if(Check_Bingo[0][2] == true && Check_Bingo[1][1] == true && Check_Bingo[2][0] == true) Exit_bingo();
        System.out.println("No");

    }
    public static void Exit_bingo()
    {
        System.out.println("Yes");
        System.exit(0);
    }
}
