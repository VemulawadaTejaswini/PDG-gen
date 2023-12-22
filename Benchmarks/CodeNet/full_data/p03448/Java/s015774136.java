import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();

        System.out.println(calc(a,b,c,x));
    }

    public static int calc(int a, int b, int c, int x) {
        int count = 0;
        int y1 = 0;
        int y2 = 0;
        int y3 = 0;
        for (int i=0;i<=a;i++) {
            y1 = i*500;
            for (int j=0;j<=b;j++) {
                y2 = j*100;
                for (int k=0;k<=c;k++) {
                    y3 = k*50;
                    if (y1+y2+y3 == x) {
                      count++;
                    }
                }
            }
        }
        return count;
    }
}
