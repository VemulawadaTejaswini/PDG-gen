import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int ans = 0;
        int cur = 0;
        for(int i=0;i<N;i++){
            if(S.charAt(i)=='I') cur++;
            else cur--;
            ans = Math.max(ans,cur);
        }
        System.out.println(ans);
    }
}
