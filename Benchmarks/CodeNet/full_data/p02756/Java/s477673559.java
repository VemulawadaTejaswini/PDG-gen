import java.util.Scanner;

class Main {
    static String reverse(String s) {
        String ans = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            ans += s.charAt(i);
        }
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
                    String temp = s;
                    s = c + temp;
                } else if (f == 2) {
                    s += c;
                }
            }
        }

        System.out.println(s);
    }
}
