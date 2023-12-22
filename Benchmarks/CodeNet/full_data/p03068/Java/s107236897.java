import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();
        int K = sc.nextInt();

        String newS = "";
        char target = S.charAt(K - 1);
        for (char s : S.toCharArray()) {
            if (s == target) {
                newS += s;
            } else {
                newS += '*';
            }
        }

        System.out.println(newS);
    }

}
