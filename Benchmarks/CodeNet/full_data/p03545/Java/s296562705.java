import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = scan.nextLine();
        char[] sc = S.toCharArray();
        int len = S.length();

        for (int i = 0; i < (1<<len); i++) {
            StringBuilder sb = new StringBuilder().append(sc[0]);
            int sum = Character.getNumericValue(sc[0]);
            for (int k = 1; k  < len; k++) {
                if ((1 & (i >> k)) == 1) {
                    sb.append("+" + sc[k]);
                    sum += Character.getNumericValue(sc[k]);
                } else {
                    sb.append("-" + sc[k]);
                    sum -= Character.getNumericValue(sc[k]);
                }
            }
            if (sum == 7) {
                System.out.println(sb.toString() + "=" + sum);
                break;
            }
        }
    }
}