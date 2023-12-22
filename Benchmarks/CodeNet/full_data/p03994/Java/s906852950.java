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
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {

            if (k >= rotate[i]) {
                // 回転させる
                k -= rotate[i];
                // s = s.substring(0, i) + 'a' + s.substring(i + 1);
                sb.append("a");
            } else {
                // 回転出来ない
                sb.append(s.charAt(i));
            }
        }
        k %= 'z' - 'a' + 1;
        char c = sb.charAt(len - 1);
        sb.deleteCharAt(len - 1);
        sb.append((char) (c + k));
        // s = s.substring(0, len - 1) + (char) (s.charAt(len - 1) + k);
        System.out.println(new String(sb));

        sc.close();
    }

    static int count(char c) {
        if (c == 'a') {
            return 0;
        }
        return ((int) ('z' - c)) + 1;
    }
}
