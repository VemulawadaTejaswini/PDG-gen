import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        int[] x = new int[5];
        x[0] = sc.nextInt();
        x[1] = sc.nextInt();
        x[2] = sc.nextInt();
        x[3] = sc.nextInt();
        x[4] = sc.nextInt();
        int k = sc.nextInt();

        for (int i=0;i<5-1;i++) {
            for (int j=i+1;j<5;j++) {
                if (Math.abs(x[i]-x[j]) > k) {
                    System.out.println(":(");
                    return;
                }
            }
        }
        System.out.println("Yay!");
    }
}