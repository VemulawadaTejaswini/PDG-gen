import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //入力受付
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] xi = new int[n];
        int[] yi = new int[n];
        int[] hi = new int[n];
        for(int i = 0; i < n; i++) {
            xi[i] = scanner.nextInt();
            yi[i] = scanner.nextInt();
            hi[i] = scanner.nextInt();
        }
        //高度が0より大きい場合、データを格納
        int x = 0, y = 0, h = 0;
        for(int i = 0; i < n; i++) {
            if(hi[i] > 0) {
                x = xi[i];
                y = yi[i];
                h = hi[i];
                break;
            }
        }
        //全探索
        for(int cx = 0; cx <= 100; cx++) {
            for(int cy = 0; cy <= 100; cy++) {
                int H = h + Math.abs(x - cx) + Math.abs(y - cy);
                boolean check = true;
                for(int i = 0; i < n; i++) {
                    if(hi[i] != Math.max(0, H - Math.abs(xi[i] - cx) - Math.abs(yi[i] - cy))) {
                        check = false;
                        break;
                    }
                }
                //出力
                if(check) {
                    System.out.println(cx + " " + cy + " " + H);
                    return;
                }
            }
        }
    }
}