import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int temp=1;
        TreeSet<Integer> set=new TreeSet<>();
        int exp=1;
        while (temp<=n){
            set.add(temp);
            temp=power(6,exp);
            exp++;
        }
        temp=1;
        exp=1;
        while (temp<=n){
            set.add(temp);
            temp=power(9,exp);
            exp++;
        }
        int[] d=new int[set.size()];
        temp=0;
        while (set.size()>0){
            d[temp++]=set.pollFirst();
        }
        int ans=Integer.MAX_VALUE;
        ArrayDeque<Integer> q=new ArrayDeque<>();
        q.addFirst(0);
        ArrayDeque<Integer> money=new ArrayDeque<>();
        money.addFirst(n);
        while (q.size()>0){
            int p=q.pollLast();
            int m=money.pollLast();
            if(p>ans)continue;
            if(m==0){
                ans=min(ans,p);
            }
            for (int i = 0; i < temp; i++) {
                if(m-d[i]>=0) {
                    q.addFirst(p + 1);
                    money.addFirst(m - d[i]);
                }
            }
        }
        out.print(ans);
    }
    static int power(int x,int n){
        if(n==0)return 1;
        if(n%2==0){
            int e=power(x,n/2);
            return e*e;
        }
       int e=x*power(x,n-1);
        return e;
    }
}