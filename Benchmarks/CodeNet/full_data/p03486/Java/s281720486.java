import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final char[] S = sc.next().toCharArray();
        final char[] T = sc.next().toCharArray();

        Arrays.sort(S);
        Arrays.sort(T);

        System.out.println(S.toString().compareTo(new StringBuffer(T.toString()).reverse().toString()) < 0 ? "Yes" : "No");
    }
}
