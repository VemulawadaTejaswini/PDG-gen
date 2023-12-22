import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n + 1];
        int[] x = new int[n + 1];
        int[] y = new int[n + 1];
        for(int i = 1;i <= n;i++) {
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        boolean isPossible = true;
        for(int i = 1;i <= n;i++) {
            int dt = t[i] - t[i - 1];
            int dx = Math.abs(x[i] - x[i - 1]);
            int dy = Math.abs(y[i] - y[i - 1]);

            if(dx + dy > dt) {
                isPossible = false;
                break;
            }
            else if(dt % 2 == 0) {
                if((dx + dy) % 2 != 0) {
                    isPossible = false;
                    break;
                }
            }
            else if(dt % 2 != 0) {
                if((dx + dy) % 2 == 0) {
                    isPossible = false;
                    break;
                }
            }
        }

        String ans = isPossible ? "Yes" : "No";
        System.out.println(ans);
    }
}