import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] c = sc.next().toCharArray();
        int[] cnt = new int[c.length];

        for (int i = 0; i < c.length; i++) {
            int index = i;
            int tmp = 0;
            while (c[i] == c[index]) {
                if (c[index] == 'R')
                    index++;
                else
                    index--;
                tmp++;
            }

            if (tmp % 2 != 0) {
                if (c[index] == 'R')
                    index++;
                else
                    index--;
            }
            cnt[index]++;
        }

        for (int i = 0; i < c.length; i++) {
            System.out.print(cnt[i] + " ");
        }
    }
}