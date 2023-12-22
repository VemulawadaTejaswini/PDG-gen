import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        StringBuilder sb = new StringBuilder(String.valueOf(sc.next()));
        boolean writeNine = false;
        for (int i = 0; i < sb.length(); i++) {
            if (writeNine) {
                sb.setCharAt(i, '9');
            } else if (i != sb.length() - 1 && sb.charAt(i + 1) != '9') {
                sb.setCharAt(i, (char) (sb.charAt(i) - 1));
                writeNine = true;
            }
        }
        System.out.println(digitSum(sb.toString()));
    }

    private static int digitSum(String num) {
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            sum += num.charAt(i) - '0';
        }
        return sum;
    }
}