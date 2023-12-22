import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        char[] chars = s.next().toCharArray();
        int[] n = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            n[i] = Character.getNumericValue(chars[i]);
        }

        int wb = 0;
        int bw = 0;

        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 1 && n[i] == 0) {
                wb++;
            } else if (i % 2 == 0 && n[i] == 1) {
                wb++;
            } else if (i % 2 == 1 && n[i] == 1) {
                bw++;
            } else if (i % 2 == 0 && n[i] == 0) {
                bw++;
            }
        }
        System.out.println(wb < bw ? wb : bw);
    }
}