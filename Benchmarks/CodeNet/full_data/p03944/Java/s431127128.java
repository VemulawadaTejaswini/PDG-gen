import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int h = sc.nextInt();
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[] a = new int[n];
        
        int wlmax = 0;
        int whmax = w;
        int hlmax = 0;
        int hhmax = h;
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            a[i] = sc.nextInt();
            
            if (a[i] == 1) {
                if (wlmax < x[i]) {
                    wlmax = x[i];
                }
            } else if (a[i] == 2) {
                if (whmax > x[i]) {
                    whmax = x[i];
                }
            } else if (a[i] == 3) {
                if (hlmax < y[i]) {
                    hlmax = y[i];
                }
            } else if (a[i] == 4) {
                if (hhmax > y[i]) {
                    hhmax = y[i];
                }
            } 
        }
        w = whmax - wlmax;
        h = hhmax - hlmax;
        if (w <= 0 || h <= 0) {
            sum = 0;
        } else {
           sum = w * h; 
        }
        System.out.println(sum);
    }
}