import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        long sum = 0;
        for (int i=0; i<Math.pow(2,S.length()-1); i++) {
            int k = 0;
            String b = zeroP(Integer.toBinaryString(i), S.length()-1);
            for (int j=0; j<S.length()-1; j++) {
                if ("1".equals(b.substring(j, j+1))) {
                        sum += Integer.parseInt(S.substring(k, j+1));
                    k = j+1;
                }
            }
            sum += Long.parseLong(S.substring(k, S.length()));
        }
        System.out.println(sum);
    }
    public static String zeroP(String S, int a) {
        while (S.length()<a) {
            S = "0" + S;
        }
        return S;
    }
}