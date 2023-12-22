import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int L = scanner.nextInt();
        int[] a = new int[N];
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int cmin = Integer.MAX_VALUE;
        for(int i = 0; i < N; i ++) {
            a[i] = L + i;
            sum += a[i];
            if(cmin > Math.abs(a[i])){
                cmin = Math.abs(a[i]);
                min = a[i];
            }
        }
        System.out.println(sum - min);
    }

}
