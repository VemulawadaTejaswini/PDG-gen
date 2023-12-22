import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int end = N-1;
        while(end>=0&&S.charAt(end)=='(') end--;
        if(end==-1){
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<N;i++) sb.append('(');
            sb.append(S);
            System.out.println(sb.toString());
        }
        else{
            int cnt1 = 0;//count for "("
            int cnt2 = 0;
            for(int i=end;i>=0;i--){
                if(S.charAt(i)=='(') cnt1++;
                else cnt2++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<cnt2-cnt1;i++) sb.append('(');
            sb.append(S);
            for(int i=0;i<(N-1-end)+Math.max(0,cnt1-cnt2);i++) sb.append(')');
            System.out.println(sb.toString());
        }
    }
}
