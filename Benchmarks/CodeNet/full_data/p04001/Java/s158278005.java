import java.util.Scanner;
 
class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int sLen = s.length();
        long ans = 0;
        for (int i = 0; i < Math.pow(2,sLen - 1); i++) {
            StringBuilder sb = new StringBuilder(s);
            int cnt = 1;
            for (int k = 0; k < sLen - 1; k++) {
                if ((1 & i >> k) == 1) {
					sb.insert(k + cnt, ",");
					cnt++;
                }
            }
            String[] temp = sb.toString().split(",");
            for (int j = 0; j<temp.length; j++) {
                ans += Long.parseLong(temp[j]);
            }
        }
        System.out.println(ans);
    }
}
