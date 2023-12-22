import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String[] s = new String[n];
        for(int i = 0; i < n; i++)
            s[i] = sc.next();
        sc.close();
        int[] ans = new int[26];
        Arrays.fill(ans, 50);
        for(int i = 0; i < n; i++){
            int[] c = new int[26];
            for(int j = 0; j < s[i].length(); j++){
                c[s[i].charAt(j)-'a']++;
            }
            for(int k = 0; k < 26; k++){
                ans[k] = Math.min(ans[k], c[k]);
            }
        }
        
        for(int i = 0; i < 26; i++){
            for(int j = 0; j < ans[i]; j++){
                System.out.print((char)('a'+i));
            }
        }
        System.out.println();
    }
}