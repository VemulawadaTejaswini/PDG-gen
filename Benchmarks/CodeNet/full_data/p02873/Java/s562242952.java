import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int[] a = new int[S.length() + 1];
        for (int i = 0; i < a.length; i++) {
            a[i] = 0;
        }
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '<') {
                while (a[i] >= a[i + 1]) {
                    a[i + 1]++;
                }
            } else {
                while (a[i] <= a[i + 1]) {
                    a[i]++;
                    int num = i;
                    while (num > 0) {
                        num = num - 1;
                        if (S.charAt(num) == '>' && a[num] <= a[num + 1]) {
                            a[num]++;
                        } else {
                            break;
                        }
                    }
                }
            }
        }

        int sum = 0;
        for (int value : a) {
            sum += value;
        }

        System.out.println(sum);
    }
}