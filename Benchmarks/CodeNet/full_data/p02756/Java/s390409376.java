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
        StringBuilder sb = new StringBuilder();
        String s = stdIn.next();
        sb.append(s);
        int q = Integer.parseInt(stdIn.next());
        for (int i = 0; i < q; i++) {
            int t = Integer.parseInt(stdIn.next());
            if (t == 1) {
                sb.reverse();
            } else if (t == 2) {
                int f = Integer.parseInt(stdIn.next());
                String c = stdIn.next();
                if (f == 1) {
                    sb.insert(0, c);
                } else if (f == 2) {
                    sb.append(c);
                }
            }
        }

        System.out.println(new String(sb));
    }
}
