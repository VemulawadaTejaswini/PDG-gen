import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 参加者数
        int K = sc.nextInt(); // 初期ポイント
        int Q = sc.nextInt(); // 問題数
        int[] points = new int[N];

        Arrays.fill(points, K-Q);
        
        for(int i=0; i<Q; i++) {
            points[sc.nextInt()-1]++;
        }
        
        for(int point:points) {
            if(point >0 ) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }

}
