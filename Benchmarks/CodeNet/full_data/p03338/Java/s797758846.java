import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        
        int count = 0;
        int max = -1;
        Set<Character> set = new HashSet<>();
        char[] exist = new char[100];
        for (int i = 1; i < n; i ++) {
            String sub1 = s.substring(0, i);
            String sub2 = s.substring(i);
            for (int j = 0; j < sub1.length(); j++){
                if (sub2.contains(String.valueOf(sub1.charAt(j))) && !set.contains(sub1.charAt(j))) count++;
                set.add(sub1.charAt(j));
            }
            max = Math.max(max, count);
            count = 0;
            set.clear();
        }
        System.out.println(max);
    }
}
