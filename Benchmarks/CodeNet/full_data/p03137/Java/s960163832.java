import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);
        List<Integer> list = Arrays.stream(br.readLine().split(" "))
            .map(Integer::parseInt)
            .sorted(Comparator.naturalOrder())
            .collect(Collectors.toList());
        int ans = 0;
        if (N < M) {
            List<Integer> list2 = new ArrayList<>();
            for (int i = 0; i < M - 1; i++) {
                list2.add(list.get(i + 1) - list.get(i));
            }
            list2.sort(Comparator.naturalOrder());
            out.println(list2.toString());
            for (int i = 0; i < M - N; i++) {
                ans += list2.get(i);
            }
        }
        out.println(ans);
        out.close();
    }
}
