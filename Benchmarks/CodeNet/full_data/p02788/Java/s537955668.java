import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class ABC153F_SilverFox {
    static int A=0;
    public static class Pair implements Comparable<Pair>{
        int X; int Hp;
        public Pair(int a, int b){
            this.X=a; this.Hp=b;
        }
        public int compareTo(Pair other){
            if(this.X<other.X)return -1;
            return 1;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] t=br.readLine().split("\\ ");
        int N=Integer.parseInt(t[0]);
        int D=Integer.parseInt(t[1]);
        A=Integer.parseInt(t[2]);
        Pair[] m=new Pair[N]; int x; int h;
        
        for (int i = 0; i < N; i++) {
            t=br.readLine().split("\\ ");
            x=Integer.parseInt(t[0]);
            h=Integer.parseInt(t[1]);
            m[i]=(new Pair(x,h));
        }
        int left=0;
        Arrays.sort(m); 
        int[] pointer=new int[N]; int p=0;
        for(int i=0;i<N;i++){
            while(p<N && m[p].X-m[i].X<=2*D){p++;}
            pointer[i]=p;//pointer[i]= 
            //smallest index s.t. m[pointer[i]]-m[i]>2D, N-1 if DNE
        }
        
        boolean flag; int ll=0; long res=0; int save=roundUp(m[left].Hp);
        while(left<N){
            flag=false;
            ll=left+1;
            res+=save;
            for(int i=left; i<pointer[left];i++){
                int hh=m[i].Hp;            
                hh-=roundUp(save)*A;
                m[i]=new Pair(m[i].X,hh);
                if(hh>0 && !flag){ll=i; flag=true;}
            }
            
            left=ll;
            
        }
        System.out.println(res);
    }
    public static int roundUp(int x){
        if(x%A==0)return x/A;
        return x/A+1;
    }
}
