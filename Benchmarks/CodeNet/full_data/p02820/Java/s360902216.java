import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int r = sc.nextInt();
        int s = sc.nextInt();
        int p = sc.nextInt();
        String[] t = sc.next().split("");

        int count = 0;
        String[] history = new String[n];
        for (int i = 0; i < k; i++) {
            String enemy = t[i];
            if (enemy.equals("r")) {
                count += p;
                history[i] = "p";
            } else if (enemy.equals("s")) {
                count += r;
                history[i] = "r";
            } else if (enemy.equals("p")) {
                count += s;
                history[i] = "s";
            }
        }

        for (int i = k; i < n; i++) {
            String enemy = t[i];
            if (enemy.equals("r")) {
                if (!history[i-k].equals("p")) {
                    history[i] = "p";
                    count += p;
                } else {
                    history[i] = "*";
                }
            } else if (enemy.equals("s")) {
                if (!history[i-k].equals("r")) {
                    history[i] = "r";
                    count += r;
                } else {
                    history[i] = "*";
                }
            } else if (enemy.equals("p")) {
                if (!history[i-k].equals("s")) {
                    history[i] = "s";
                    count += s;
                } else {
                    history[i] = "*";
                }
            }
        }
        System.out.println(count);
    }
}