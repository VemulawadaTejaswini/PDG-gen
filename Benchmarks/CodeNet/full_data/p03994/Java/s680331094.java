import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        int len = s.length();
        int rotate[] = new int[len];
        for (int i = 0; i < len; i++) {
            rotate[i] = count(s.charAt(i));
        }
        for (int i = 0; i < len; i++) {

            if (k >= rotate[i]) {
                // 回転させる
                k -= rotate[i];
                s = s.substring(0, i) + 'a' + s.substring(i + 1);
            } else {
                // 回転出来ない
            }
        }
        k %= 'z' - 'a' + 1;
        s = s.substring(0, len - 1) + (char) (s.charAt(len - 1) + k);
        System.out.println(s);

        sc.close();
    }

    static int count(char c) {
        if (c == 'a') {
            return 0;
        }
        return ((int) ('z' - c)) + 1;
    }
}
