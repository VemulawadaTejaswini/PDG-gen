import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        
        int[] sArray = new int[n + 1000];
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
        j++;
        
        int max = sArray[0];
        for (int i = 0; i < n; i++) {
            int cnt = sArray[i] + sArray[i + 1];
            if (cnt == 0) break;
            
            for (int l = i + 2; l < i + k * 2; l++) {
                cnt += sArray[l];
            }
            
            if (i % 2 == 1) {
                cnt += sArray[i + k * 2];
            }
            
            max = Math.max(max, cnt);
        }
        
        System.out.println(max);
    }
}