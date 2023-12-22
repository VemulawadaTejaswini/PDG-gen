import java.util.*;

class Main{

    static final int DIV = 100000007;
    static final int MAX = 2000000000;

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] ary = new int[n];
        for(long i:ary)i = sc.nextInt();
        long ans = MAX;
        for(int i = 0;i < n-k+1;i++){
            int a = ary[i];
            int b = ary[k+i-1];
            int sub = a-b;
            if(sub<0)sub *= -1;
            if(a<0)a*=-1;
            if(b<0)b*=-1;
            int tmp = sub+a<b?a:b;
            if(tmp<ans)ans=tmp;
        }
        System.out.println(ans);
    }
}