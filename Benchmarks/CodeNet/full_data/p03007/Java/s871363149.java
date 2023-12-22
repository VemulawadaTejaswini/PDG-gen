import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = Integer.parseInt(stdin.nextLine());
        int[] a = Pattern.compile(" ").splitAsStream(stdin.nextLine()).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(a);

        List<String> history = new ArrayList<>();
        history.add(a[0] +  " " + a[n - 1]);
        int ans = a[0] - a[n - 1];
        for (int i = n - 2; i > 1; i--) {
            history.add(ans + " " + a[i]);
            ans = ans - a[i];
        }

        history.add(a[1] + " " + ans);
        ans = a[1] - ans;

        System.out.println(ans);
        history.forEach(System.out::println);
    }

}