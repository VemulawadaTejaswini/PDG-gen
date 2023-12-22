import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int k = 0;
        int mem=0;
        int mem2=0;
        int mem3=1;
        int mem4=0;
        int ans=1;
        for(int i=0;i<b;i++){
            int c = scan.nextInt();
            if(c==mem+1&&mem!=0){ans=0;break;}
            mem2=fact(c-mem-1);
            int u = c-mem;
            int w = 0;
            mem4=0;
            while(true){
                mem3=1;
                mem3*=fact(u);
                mem3*=fact(w);
                mem4=mem2/mem3;
                w+=1;
                u-=2;
                if(u<0)break;
            }
            ans*=mem4;
            mem=c;
        }
        if(ans!=0){
            mem2=fact(a-mem-1);
        int u = a-mem;
        int w = 0;
        mem4=0;
        while(true){
            mem3=1;
            mem3*=fact(u);
            mem3*=fact(w);
            mem4=mem2/mem3;
            w+=1;
            u-=2;
            if(u<0)break;
        }
        ans*=mem4;
        }
        
        System.out.println(ans%100000007);
    }
    private static int fact(int n) {
        if(n==1||n==0) return 1;
        else     return n * fact(n-1);
    }
}