import java.util.Scanner;

class Main {
    static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        String ans = new String(sb);
        return ans;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String s = stdIn.next();
        int q = Integer.parseInt(stdIn.next());
        for (int i = 0; i < q; i++) {
            int t = Integer.parseInt(stdIn.next());
            if (t == 1) {
                s = reverse(s);
            } else if (t == 2) {
                int f = Integer.parseInt(stdIn.next());
                String c = stdIn.next();
                if (f == 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(c);
                    sb.append(s);
                    s = new String(sb);
                } else if (f == 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(s);
                    sb.append(c);
                    s = new String(sb);
                }
            }
        }

        System.out.println(s);
    }
}
