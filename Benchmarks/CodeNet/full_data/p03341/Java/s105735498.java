import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N  = scan.nextInt();
        String S  = scan.next();
        int[] w = new int[N];
        int[] e = new int[N];
        for(int i=0;i<N;++i){
            if(S.charAt(i)=='E')e[i]++;
            else w[i]++;
        }
        for(int i=1;i<N;++i)w[i]+=w[i-1];
        for(int i=N-2;i>=0;--i)e[i]+=e[i+1];
        int ans = N;
        for(int i=0;i<N;++i){
            int res = 0;
            if(i>0)res+=w[i-1];
            if(i<N-1)res+=e[i+1];
            ans=Math.min(ans, res);
        }
        System.out.println(ans);

    }
}