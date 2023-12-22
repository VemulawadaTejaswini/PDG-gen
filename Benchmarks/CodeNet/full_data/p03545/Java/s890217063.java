import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        for (int i=0; i<Math.pow(2,S.length()-1); i++) {
            int sum = Integer.parseInt(S.substring(0, 1));
            StringBuilder sb = new StringBuilder();
            sb.append(S.substring(0, 1));
            String b = zeroP(Integer.toBinaryString(i), S.length()-1);
            for (int j=1; j<S.length(); j++) {
                if ("1".equals(b.substring(j-1, j))) {
                        sum += Integer.parseInt(S.substring(j, j+1));
                        sb.append("+" + S.substring(j, j+1));
                } else {
                    sum -= Integer.parseInt(S.substring(j, j+1));
                    sb.append("-" + S.substring(j, j+1));
                }
            }
            if (sum==7) {
                System.out.println(sb + "=7");
                break;
            }
        }
    }

    public static String zeroP(String S, int a) {
        while (S.length()<a) {
            S = "0" + S;
        }
        return S;
    }
}