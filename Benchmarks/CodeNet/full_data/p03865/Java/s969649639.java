import java.util.*;

public class Main{
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int inf = (int)1e9;
        
        int[] db = new int[26];
        Arrays.fill(db, -1);
        String s = sc.nextLine();
        for(int i=0; i<s.length(); i++){
            int idx = s.charAt(i)-'a';
            if(db[idx] == -1){
                db[idx] = idx % 2;
            }else{
                db[idx] += idx;
            }
        }
        
        int ans = 0;
        boolean f = true;
        for(int i=0; i<26; i++){
            if(db[i] > 1){
                ans += db[i];
                f = false;
            }
        }
        
        if(f){
            ans = s.length()+1;
        }
        
        System.out.println((ans%2==0)?"First":"Second");
        
    }
}