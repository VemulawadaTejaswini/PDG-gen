import java.util.*;

class Main {
    static final int A=100001;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        int[]f=new int[A];
        for(int i=0;i<n;++i){
            f[Integer.parseInt(scan.next())]++;
        }
        int[]g=new int[m];
        int[]e=new int[m];
        for(int i=0;i<A;++i)g[i%m]+=f[i];
        for(int i=0;i<A;++i)e[i%m]+=f[i]/2;
        int t=g[0]/2;
        if(m%2==0)t+=g[m/2]/2;
        for(int i=1;2*i<m;++i){
            int u=Math.min(g[i],g[m-i]);
            t+=u+Math.min(e[i],(g[i]-u)/2)+Math.min(e[m-i],(g[m-i]-u)/2);
        }
        System.out.println(t);
    }
}
