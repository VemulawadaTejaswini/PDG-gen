import java.util.*;
public class Main {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        HashMap<String,Integer> num = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String s = scanner.next();
            int[] count = new int[26];
            for (int j = 0; j < 10; j++) {
                char sj = s.charAt(j);
                count[sj-'a']++;
            }
            String val = "";
            for(int j=0; j<26; j++){
                val += String.valueOf('a'+count[j]);
            }
            num.putIfAbsent(val, 0);
            num.put(val,num.get(val) + 1);
        }
        long ans = 0;
        for(Integer n:num.values()){
            ans += (long)n*(long)(n-1)/2;
        }
        System.out.println(ans);
    }
}