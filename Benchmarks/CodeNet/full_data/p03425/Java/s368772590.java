import java.util.*;
public class Main {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            char c = s.charAt(0);
            if (c != 'M' && c != 'A' && c != 'R' && c != 'C' && c != 'H') continue;
            int count = map.getOrDefault(c, 0);
            map.put(c, ++count);
        }

        if (map.size() < 3) {
            System.out.println(0);
            return;
        }
        
        long ans = 0;
        for (int i =0; i<=2; i++) {
            for (int j =i+1; j<=3; j++) {
                for (int k =j+1; k<=4; k++) {
                    ans += (long)map.get(i) * map.get(j) * map.get(k);
                }
            }
        }
        System.out.println(ans);
        
    }
}