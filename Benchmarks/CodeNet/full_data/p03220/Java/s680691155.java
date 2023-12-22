import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int A = sc.nextInt();
        int[] hArr = new int[N];
        for (int i = 0; i < hArr.length; i++) {
            hArr[i] = sc.nextInt();
        }
        sc.close();

        double ht;               // 対象地の気温
        double dif = 0;          // 対象地の目標気温差
        double min = 100000000;  // 候補地の目標気温差
        int hn  = 0;             // 候補地の番号

        // 目標気温差が最小の候補地を選定
        for (int i = 0; i < hArr.length; i++) {

            ht = T - (hArr[i] * 0.006);
            dif = Math.abs(A - ht);

            if(min > dif) {
                hn = i;
                min = dif;
            };
        }
        System.out.println(hn + 1);
    }
}