import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[4];
        int[] y = new int[4];
        for (int i = 0; i < 2; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int movex = x[1] - x[0];
        int movey = y[1] - y[0];
        x[2] = x[1] - movey;
        y[2] = y[1] + movex;
        x[3] = x[0] - movey;
        y[3] = y[0] + movex;
        for (int i = 2; i < y.length; i++) {
            System.out.print(x[i] + " " + y[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}