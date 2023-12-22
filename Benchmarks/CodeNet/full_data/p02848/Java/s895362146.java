import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int N = Integer.parseInt(sc.next());
        final String S = sc.next();
        sc.close();

        StringBuilder sb = new StringBuilder(S);
        final String ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i=0; i<sb.length(); i++) {
            for (int j=0; j<ABC.length()-1; j++) {
                if (sb.substring(i, i+1).equals(ABC.substring(j, j+1))) {
                    sb.replace(i, i+1, ABC.substring(j+N, j+N+1));
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}