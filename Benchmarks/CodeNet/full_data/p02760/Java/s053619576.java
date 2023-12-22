import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] bingo = new int[9];
        int[][] card = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
        boolean ok = false;
        for(int i = 0;i < 9;i++){
            bingo[i] = sc.nextInt();
        }

        int n = sc.nextInt();

        for(int i = 0;i < n;i++){
            int b = sc.nextInt();
            for(int j = 0;j < 9;j++){
                if(b == bingo[j])
                    bingo[j] = 0;
            }
        }

        for(int i = 0;i < 8;i++){
            if(bingo[card[i][0]] + bingo[card[i][1]] + bingo[card[i][2]] == 0)
                ok = true;
        }
        System.out.println(ok ? "Yes" : "No");


    }
}