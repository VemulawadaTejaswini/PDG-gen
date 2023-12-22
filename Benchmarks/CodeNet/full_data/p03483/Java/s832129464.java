import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int[] cnt = new int[26];
        int len = S.length();
        for(int i=0;i<len;i++){
            cnt[S.charAt(i)-'a']++;
        }
        int odd = 0;
        int even = 0;
        for(int i=0;i<26;i++){
            if(cnt[i]%2==0) even++;
            else odd++;
        }
        if((len%2==0&&odd>0)||(len%2==1&&odd!=1)){
            System.out.println(-1);
            System.exit(0);
        }
        int[] rec = new int[26];
        for(int i=0;i<len;i++){
            char cur = S.charAt(i);
            rec[cur-'a'] += i+1;
        }
        int ans = 0;
        for(int i=0;i<26;i++){
            if(cnt[i]==0) continue;
            if(cnt[i]%2==0){
                if(rec[i]<cnt[i]/2*(1+len)) ans += cnt[i]/2*(1+len)-rec[i];
            }
            else{
                if(rec[i]<cnt[i]/2*(1+len)+(1+len)/2){
                    ans += cnt[i]/2*(1+len)+(1+len)/2 - rec[i];
                }
            }
        }
        System.out.println(ans);
    }
}
