import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split("");
        long ans = 0;
        for (long i = 0; i < Math.pow(2, N); i++) {
            String bin = String.format("%" + N + "s", Long.toBinaryString(i));
            ans += count(arr, bin.split(""));
        }
        out.println(ans % 1000000007);
        out.close();
    }
    
    private static long count(String[] arr, String[] target) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < target.length; i++) {
            if (target[i].equals("1")) {
                list.add(arr[i]);
            }
        }
        if (list.size() == 0) {
            return 0;   
        }
        long count = list.stream().distinct().count();
        if (count == list.size()) {
            return 1;
        }
        return 0;
    }
}
