public class Atcoder_20161001_A {

    public static void Main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        int s_cnt = s.length();
        StringBuilder sb = new StringBuilder();
        for (int l = s_cnt / 2; l >= 1; l--) {
            sb = new StringBuilder();
            for (int m = 1; m <= l; m++) {
                sb.append("S");
            }
            for (int m = 1; m <= l; m++) {
                sb.append("T");
            }
            s = s.replaceAll(sb.toString(), "");
            if (s.indexOf("ST", 0) == -1)
                break;
        }
        System.out.println(s.length());
    }
}