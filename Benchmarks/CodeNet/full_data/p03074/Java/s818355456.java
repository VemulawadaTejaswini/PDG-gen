import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        
        int[] sArray = new int[n + 1];
        int j = 0;
        int nowNum = 0;
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            int num = Integer.valueOf(String.valueOf(s.charAt(i)));
            if (num == nowNum) {
                count++;
                continue;
            } else {
                sArray[j] = count;
                j++;
                count = 1;
                if (nowNum == 0) {
                    nowNum = 1;
                } else {
                    nowNum = 0;
                }
            }
        }
        sArray[j] = count;
        
        int max = 0;
        boolean end = false;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            if (i % 2 == 0) {
                for (int l = i; l < i + k * 2; l++) {
                    cnt += sArray[l];
                    if (l > j) end = true;
                }
                
            } else {
                for (int l = i; l <= i + k * 2; l++) {
                    cnt += sArray[l];
                    if (l > j) end = true;
                }
            }
            max = Math.max(max, cnt);
            if (end) break;
        }
        
        System.out.println(max);
    }
}