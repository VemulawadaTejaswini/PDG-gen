import java.util.Scanner;

public class Main {
    //ROT N
    //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        System.out.println(helper(s, n));
        sc.close();
    }

    static String helper(String s, int n) {
        char[] A = new char[52];
        for (int i = 0; i < 26; i++) {
            A[i] = (char) (65 + i);
        }
        for (int i = 26; i < 52; i++) {
            A[i] = (char) (65 + i - 26);
        }
        char[] B = s.toCharArray();
        for (int i = 0; i < B.length; i++) {
            int index = B[i] - 'A';
            B[i] = A[index + n];
        }
        StringBuilder sb = new StringBuilder();
        for (char c : B) sb.append(c);
        return sb.toString();
    }
}
