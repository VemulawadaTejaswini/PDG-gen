import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next();
            int n = s.length();

            int[] c = new int[n];

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'R') {
                    for (int j = i + 1; j < n; j++) {
                        if (s.charAt(j) == 'L') {
                            if ((j - i) % 2 == 1) {
                                c[j - 1]++;
                            } else {
                                c[j]++;
                            }
                            break;
                        }
                    }
                } else {
                    for (int j = i - 1; j >= 0; j--) {
                        if (s.charAt(j) == 'R') {
                            if ((i - j) % 2 == 1) {
                                c[j + 1]++;
                            } else {
                                c[j]++;
                            }
                            break;
                        }
                    }
                }
            }

            System.out.print(c[0]);
            for (int i = 1; i < n; i++) {
                System.out.print(" " + c[i]);
            }
        }
    }

}
