import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLong();
        }
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < 100; i++) {
            map.put(i, 0);
        }
        
        for (int i = 0; i < n; i++) {
            long num = array[i];
            String binary = Long.toBinaryString(num);
            for (int j = binary.length() - 1; j >= 0; j--) {
                int d = Integer.valueOf(binary.charAt(j));
                if (d == 0) continue;
                
                int key = (binary.length() - 1) - j;
                int val = map.get(key);
                map.put(key, val + 1);
            }
        }
        
        int[] digits = new int[100];
        for (int i = 0; i < 100; i++) {
            if (!map.containsKey(i)) continue;
            
            int val = map.get(i);
            if (val <= n / 2) {
                digits[i] = 1;
            }
        }
        
        String str = "";
        for (int i = 0; i < 100; i++) {
            if (k >= (long)Math.pow(2, i) && digits[i] == 1) {
                str = "1" + str;
            } else {
                str = "0" + str;
            }
        }
        
        Arrays.fill(digits, 0);
        for (int i = 0; i < n; i++) {
            long num = array[i];
            String binary = Long.toBinaryString(num);
            while (binary.length() < 100) {
                binary = "0" + binary;
            }
            
            for (int j = 100 - 1; j >= 0; j--) {
                int key = (binary.length() - 1) - j;
                if (str.charAt(j) != binary.charAt(j)) {
                    digits[key]++;
                }
            }
        }
        
        long ans = 0;
        for (int i = 0; i < 100; i++) {
            ans += digits[i] * (long)Math.pow(2, i);
        }
        
        System.out.println(ans);
    }
}
