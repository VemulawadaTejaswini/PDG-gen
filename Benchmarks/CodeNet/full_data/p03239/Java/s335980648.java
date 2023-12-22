import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] c = new int[a];
        int[] d = new int[a];
        int number = 0;
        int answer = 10000;
        for (int i = 0; i < a; i++) {
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
            if (b >= d[i]) {
                if (c[i] < answer) {
                    answer = c[i];
                }
            }
        }
        if (answer == 10000) {
            System.out.println("TLE");
        } else {
            System.out.println(answer);
        }
    }

}