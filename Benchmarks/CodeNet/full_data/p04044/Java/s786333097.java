import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Integer n = Integer.valueOf(s.substring(0, 1));


        String[] ans = new String[n];
        for (int i=0; i< n; i++) {
            ans[i] = scanner.nextLine();
        }

        Arrays.sort(ans);

        for (String a: ans)
            System.out.print(a);

    }
}
