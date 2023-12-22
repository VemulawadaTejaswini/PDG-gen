import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt=0;
        int c1=0,c2=0,c3=0;
        int ans = 0;
        for(int i=0; i<n; i++){
            char[] s = sc.next().toCharArray();
            for(int j=0; j< s.length-1; j++){
                if(s[j]=='A' && s[j+1]=='B') cnt++;
            }
            if(s[0] == 'B' && s[s.length-1]=='A') c1++;
            else if(s[0]=='B') c2++;
            else if(s[s.length-1]) c3++;
        }
        if(c1 != 0){
            if(c2+c3 > 0){
                ans = Math.min(c2,c3) + c1;
            }else{
                ans = c1 - 1;
            }
        }else{
            ans = Math.min(c2,c1);
        }
        System.out.println(ans);
    }
}
