import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);

        List<List<String>> list = new ArrayList<>();
        List<String> pList = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            String[] arr2 = br.readLine().split(" ");
            int length = Integer.parseInt(arr2[0]);
            list.add(Arrays.asList(Arrays.copyOfRange(arr2, 1, length + 1)));
        }

        pList = Arrays.asList(br.readLine().split(" "));
        int pow = (int)Math.pow(2, N);
        List<List<Integer>> list2 = new ArrayList<>();
        for (int i = 0; i < pow; i++) {
            String val = Integer.toBinaryString(i);
            String bin = String.format("%0"+ N + "d", Integer.valueOf(val));
            List<Integer> l = Arrays.stream(bin.split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
            list2.add(l);
        }

        int ans = 0;

        for (int i = 0; i < list2.size(); i++) {
            List<Integer> l = list2.get(i);
            Set<String> onSet = new HashSet<>();
            Set<String> offSet = new HashSet<>();
            for (int j = 0; j < l.size(); j++) {
                if (l.get(j) == 0) {
                    offSet.add(String.valueOf(j + 1));
                } else {
                    onSet.add(String.valueOf(j + 1));
                }
            }

            for (int j = 0; j < list.size(); j++) {
                List<String> sl = list.get(j);
                int onCount = 0;
                for (String s: sl) {
                    if (onSet.contains(s)) {
                        onCount++;
                    }
                }
                if (onCount % 2 != Integer.parseInt(pList.get(j))) {
                    break;
                }
                if (j == list.size() - 1) {
                    ans++;
                }
            }
        }

        out.println(ans);
        out.close();
    }
}
