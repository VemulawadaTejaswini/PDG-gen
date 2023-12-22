import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (i % 2 == 0) {
                builder1.append("0");
                builder2.append("1");
            } else {
                builder1.append("1");
                builder2.append("0");
            }
        }
        final int dec = Integer.parseInt(S, 2);
        final int expected1 = Integer.parseInt(builder1.toString(), 2);
        final int expected2 = Integer.parseInt(builder2.toString(), 2);
        int min = dec ^ expected1;
        if (min > (dec ^ expected2)) {
            min = dec ^ expected2;
        }
        System.out.println(Integer.toBinaryString(min).replace("0", "").length());
    }
}