import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        int preT = 0;
        int preX = 0;
        int preY = 0;
        for (int i=0; i<N; i++) {
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(judgeValidMove(t - preT, x - preX, y - preY) == false) {
                System.out.println("No");
                return;
            }
            preT = t;
            preX = x;
            preY = y;
        }
        System.out.println("Yes");
        sc.close();
    }

    public static boolean judgeValidMove(int t,int x,int y){
        final int minDist = Math.abs(x) + Math.abs(y);
        final int difDist = t - minDist;
        // 到達可能な距離か
        if(difDist < 0){
            return false;
        }
        // 最短でたどり着いた時間と予定時間の差が偶数なら到達可能
        if(difDist % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
}