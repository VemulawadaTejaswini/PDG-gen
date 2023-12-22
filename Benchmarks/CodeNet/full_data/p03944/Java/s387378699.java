import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // B - xxxxx

        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();   // 1 <= w,h <= 100
        int h = sc.nextInt();
        int n = sc.nextInt();   // 1 <= n <= 100

        int x1 = 0;
        int x2 = w;
        int y1 = 0;
        int y2 = h;
        
        int[] x = new int[n];   // 0 <= x <= w
        int[] y = new int[n];   // 0 <= y <= h
        int[] a = new int[n];   // 1, 2, 3, 4

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            a[i] = sc.nextInt();
            
            switch(a[i]) {
            case 1:
                x1 = x[i];
                break;
            case 2:
                x2 = x[i];
                break;
            case 3:
                y1 = y[i];
                break;
            case 4:
                y2 = y[i];
                break;
            }
        }

        int xx = x2 - x1;
        int yy = y2 - y1;
        
        System.out.println((xx > 0 && yy > 0) ? xx * yy : 0);
    }

}