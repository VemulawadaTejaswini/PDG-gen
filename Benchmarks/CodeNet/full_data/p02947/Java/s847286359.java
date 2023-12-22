import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        
        Long count = new Long(0);

        Integer n = Integer.parseInt(stdin.readLine());
        
        Map<String, Integer> map = new HashMap<>();
        
        // 標準入力を1行ずつ読み出す。
        String line;
        while ((line = stdin.readLine()) != null) {
            char[] chars = line.toCharArray();
            Arrays.sort(chars);
            String newStr = new String(chars);
            Integer temp = map.get(newStr);
            if (temp == null) {
                map.put(newStr, 1);
            } else {
                count += temp;
                map.put(newStr, temp+1);
            }
        }
        System.out.println(count);
    }
}