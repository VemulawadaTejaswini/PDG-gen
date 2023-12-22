import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = Integer.parseInt(stdIn.next());
        int m = Integer.parseInt(stdIn.next());
        int[] p = new int[m];
        String[] s = new String[m];
        for (int i = 0; i < m; i++) {
            p[i] = Integer.parseInt(stdIn.next());
            s[i] = stdIn.next();
        }

        int ac = 0;
        int wa = 0;
        boolean[] notCount = new boolean[n];
        for (int i = 0; i < m; i++) {
            if (!notCount[p[i] - 1] && s[i].equals("AC")) {
                ac++;
                notCount[p[i] - 1] = true;
            } else if (!notCount[p[i] - 1] && s[i].equals("WA")) {
                wa++;
            }
        }

        System.out.println(ac + " " + wa);
    }
}