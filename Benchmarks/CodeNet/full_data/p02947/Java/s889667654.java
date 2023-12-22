import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        List<String> s = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        int result = 0;

        for (int i = 0; i < n; i++) {
            String[] arrS = sc.next().split("");
            Arrays.sort(arrS);
            sb.setLength(0);
            for (String str : arrS) {
                sb.append(str);
            }
            for (int j = 0; j < s.size(); j++) {
                if (sb.toString().equals(s.get(j))) {
                    result++;
                }
            }
            s.add(sb.toString());
        }

        System.out.println(result);
    }
}