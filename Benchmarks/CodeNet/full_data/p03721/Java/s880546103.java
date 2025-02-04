import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String... args) throws IOException {
        String[] params = br.readLine().split(" ");
        int n = Integer.parseInt(params[0]);
        long k = Long.parseLong(params[1]);

        Map<Integer, Long> inData = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] data = br.readLine().split(" ");
            int key = Integer.parseInt(data[0]);
            long val = Long.parseLong(data[1]);
            if (inData.get(key) == null) {
                inData.put(key, val);
            } else {
                inData.put(key, inData.get(key) + val);
            }
        }
        long curCount = 0;
        for (Map.Entry<Integer, Long> entry : inData.entrySet()) {
            curCount += entry.getValue();
            if (k <= curCount) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}