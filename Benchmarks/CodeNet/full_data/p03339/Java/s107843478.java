import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt();
        String s = sc.next();
        char[] ss = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ss[i] = s.charAt(i);
        }

        int[] countE = new int[ss.length];
        int[] countW = new int[ss.length];
        int currentE = 0, currentW = 0;
        for (int i = ss.length - 1; i >= 0; i--) {
            if (ss[i] == 'E') {
                currentE += 1;
            }
            countE[i] = currentE;
        }
        for (int i = 0; i < ss.length; i++) {
            if (ss[i] == 'W') {
                currentW += 1;
            }
            countW[i] = currentW;
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < ss.length; i++) {
            int count = 0;
            if (i != ss.length - 1) {
                count += countE[i + 1];
            }
            if (i != 0) {
                count += countW[i - 1];
            }
            min = Math.min(count, min);
        }
        System.out.println(min);
    }
}
