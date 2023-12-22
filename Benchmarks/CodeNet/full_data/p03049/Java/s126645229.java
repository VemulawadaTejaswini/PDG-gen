import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        String[] s = new String[N];
        int ans = 0;
        int cntA = 0;
        int cntB = 0;
        int flag = -1;
        int cnt = 0;
        for(int i = 0; i < N; i++){
            s[i] = sc.next();
            for(int j = 0; j < s[i].length()-1; j++){
                if(s[i].charAt(j)=='A' && s[i].charAt(j+1)=='B')
                    ans++;
            }
            if(s[i].charAt(s[i].length()-1) == 'A'){
                cntA++;
                cnt++;
                flag = 1;
            }
            if(s[i].charAt(0) == 'B'){
                cntB++;
                if(flag == -1)
                    cnt++;
            }
            flag = -1;
        }
        sc.close();

        int min = Math.min(cntA, cntB);
        if(cntA == cntB && cntA == cnt)
            min--;
        System.out.println(ans+min);
    }
}