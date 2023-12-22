import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String strArr[] = br.readLine().split(" ");
            int n = Integer.parseInt(strArr[0]);
            int k = Integer.parseInt(strArr[1]);
            TreeMap<Integer, Integer> map = new TreeMap<Integer,Integer>();
            for (int i = 0; i < n; i++) {
                strArr = br.readLine().split(" ");
                int num = Integer.parseInt(strArr[0]);
                int count = Integer.parseInt(strArr[1]);
                if (map.containsKey(num)) {
                    int before = map.get(num);
                    map.put(num, count + before);
                } else {
                    map.put(num, count);
                }
            }
            int temp = 0;
            for (int nKey : map.keySet()) {
                temp = temp + map.get(nKey);
                if (temp >= k) {
                    System.out.println(nKey);
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}