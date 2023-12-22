import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] s = sc.next().toCharArray();

        boolean isFind = false;
        int count = 0;

        while (true) {
            isFind = false;

            for (int i = 0; i < s.length - 2; i++) {
                if (s[i] == 'A' && s[i + 1] == 'B' && s[i + 2] == 'C') {
                    isFind = true;
                    count++;

                    s[i] = 'B';
                    s[i + 1] = 'C';
                    s[i + 2] = 'A';
                }
            }

            if (!isFind) {
                break;
            }
        }

        System.out.println(count);
    }
}