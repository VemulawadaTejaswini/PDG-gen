import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static int N;
    private static String A, B;
    private static int rank = 0;
    private static Map<String, Integer> mp = new HashMap<>();

    private static void permutation(String s, int len) {
        if(len == N) {
            mp.put(s, rank++);
        } else {
            for(int i = 1;i <= N;i++) {
                if(!s.contains(Integer.toString(i))) {
                    permutation(s + Integer.toString(i), len+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();scanner.nextLine();
        A = scanner.nextLine().replaceAll(" ", "");
        B = scanner.nextLine().replaceAll(" ", "");

        permutation("", 0);
        System.out.println(Math.abs(mp.get(A) - mp.get(B)));
    }
}
