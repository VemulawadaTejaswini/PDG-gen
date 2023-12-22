import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int min = 124;
        int max = -1;

        for (int i = 0; i < 5; i++) {
            int n = in.nextInt();
            if (n < min)
                min = n;
            if(n > max)
                max = n;
        }
        int k = in.nextInt();
        System.out.println((max - min <= k) ? "Yay!" : ":(");
        in.close();
    }
}