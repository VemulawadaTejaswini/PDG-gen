import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean ans = isPalind(str, 0, str.length()) &&
                isPalind(str, 0, (str.length() - 1) / 2) &&
                isPalind(str, (str.length() + 3) / 2 - 1, str.length());
        System.out.println(ans ? "Yes" : "No");
    }

    static boolean isPalind(String str, int s, int e) {
        StringBuilder rsb = new StringBuilder();
        char[] C = str.toCharArray();
        for(int i = s; i < e - s; i++) {
            if(C[i] != C[e - i - 1]) return false;
        }
        return true;
    }
}
