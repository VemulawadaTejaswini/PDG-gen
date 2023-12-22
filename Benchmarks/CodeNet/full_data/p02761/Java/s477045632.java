import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (m == 0) {
            System.out.println(-1);
        } else {
            int[] s = new int[m];
            int[] c = new int[m];
            for (int i = 0; i < m; i++) {
                s[i] = sc.nextInt();
                c[i] = sc.nextInt();
            }
            boolean judge = true;
            loop: for (int i = 0; i < m; i++) {
                for (int j = i + 1; j < m; j++) {
                    if (s[i] == s[j] && c[i] != c[j]) {
                        judge = false;
                        break loop;    
                    }
                }
            }
            if (judge) {
                String str = "";
                for (int i = 1; i <= n; i++) {
                    boolean find = false;
                    for (int j = 0; j < m; j++) {
                        if (s[j] == i) {
                            find = true;
                            str += c[j];
                            break;
                        }
                    }
                    if (!find) {
                        str += 0;
                    }
                }
                if (n == 1) {
                    System.out.println(Integer.parseInt(str));
                } else {
                    if (str.charAt(0) == '0') {
                        System.out.println(-1);
                    } else {
                        System.out.println(Integer.parseInt(str));
                    }
                }
            } else {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}