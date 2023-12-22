import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        boolean[] bool = new boolean[n]; 
        int counter = 0;
        for (int i = 0; i < p.length; i++) {
            p[i] = sc.nextInt();
        }
        for (int i = 0; i < p.length; i++) {
            if (i >= 1 && bool[i - 1] == false && p[i - 1] > p[i]) {
                counter++;
                continue;
            }
            if (n - p[i] + 1 < i + 1) {
                continue;
            } else {
                for (int j = 0; j <= i; j++) {
                    if (p[i] > p[j]) {
                        bool[i] = true;
                        break;
                    }
                }
                if (!bool[i]) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
        sc.close();
    }
}