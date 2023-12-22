import java.util.Scanner;

/**
 * Created by mizuk on 2017/07/26.
 */
public class Main {
    private static int H;
    private static int W;
    private static int N;
    private static int a[];

    private static int table[][];

    public static void input(){
        Scanner scan = new Scanner(System.in);
        H = scan.nextInt();
        W = scan.nextInt();
        N = scan.nextInt();
        a = new int[N];

        for(int i=0;i<N;i++) {
            a[i] = scan.nextInt();
        }

        table = new int[H][W];
    }

    public static void main(String args[]){
        //入力
        input();

        int count_row = 0;  //行のカウント
        int count_col = 0;  //列のカウント
        int num = 1;
        boolean flag = true;

        int j = 0;
        while (j < N){
            // numの個数、a[j]回分だけ繰り返す
            for(int i=0;i<a[j];i++){
                if(count_row == H){
                    flag = !flag;
                    count_row--;
                    count_col++;
                }
                if(count_row == -1){
                    flag = !flag;
                    count_row++;
                    count_col++;
                }

                if(flag) table[count_row++][count_col] = num;   //flagがtrueのときはカウントアップ
                else table[count_row--][count_col] = num;       //flagがfalseのときはカウントダウン
            }
            num++;
            j++;
        }

        //出力
        for(int i=0;i<H;i++){
            for (int k=0;k<W;k++){
                System.out.print(table[i][k] + "  ");
            }
            System.out.println();
        }

    }
}