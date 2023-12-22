import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int q = sc.nextInt();
        
        Map<Character, TreeSet<Integer>> charRangeMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
           char c = s.charAt(i);
           if(!charRangeMap.containsKey(c))
             charRangeMap.put(c, new TreeSet<>());
           charRangeMap.get(c).add(i);
        }
        char[] charArray = s.toCharArray();
        for(int i = 0; i < q; i++) {
            int oper = sc.nextInt();
            if(oper == 1) {
                int idx = sc.nextInt() - 1;
                char newChar = sc.next().charAt(0);
                char originalChar = charArray[idx];
                if(originalChar == newChar) continue;
                charArray[idx] = newChar;
                if(!charRangeMap.containsKey(newChar)) {
                    charRangeMap.put(newChar, new TreeSet<>());
                }
                charRangeMap.get(originalChar).remove(idx);
                charRangeMap.get(newChar).add(idx);
            } else {
                int left = sc.nextInt() - 1;
                int right = sc.nextInt() - 1;
                int cnt = 0;
                for(Map.Entry<Character, TreeSet<Integer>> entry : charRangeMap.entrySet()) {
                     TreeSet<Integer> range = entry.getValue();
                     if(range.size() == 0 || range.first() > right || range.last() < left) continue;
                     else cnt++;
                }
                System.out.println(cnt);
            }
        }
    }
}
