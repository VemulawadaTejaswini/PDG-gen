import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] lines = br.readLine().split(" ");
        int[] A = new int[N];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++) {
            int x = Integer.parseInt(lines[i]);
            A[i] = x;
            if(map.containsKey(x)) {
                map.put(x, map.get(x)+1);
            }else {
                map.put(x, 1);
            }
        }
        for(int i = 0; i < N; i++) {
            long result = 0;
            int x = A[i];
            for(int key: map.keySet()) {
                if(key == x) {
                    result += (map.get(key)-1) * (map.get(key)-2) / 2;
                }else {
                    result += (map.get(key) * (map.get(key)-1)) /2;
                }
            }
            out.println(result);
        }
        out.flush();
        out.close();
        br.close();
    }
}