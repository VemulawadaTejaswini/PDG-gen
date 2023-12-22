import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {

    public static class Pair implements Comparable<Pair>{
        int l; int r;
        public Pair(int x, int y){
            this.l=x; this.r=y;
        }
        public int compareTo(Pair other){
            if(this.r<other.r)return -1;
            else if(this.r==other.r){
                if(this.l<other.l)return -1;
                return 1;
            }
            return 1;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        Pair[] arr=new Pair[N];
        String[] t; int l; int r;
        for (int i = 0; i < N; i++) {
            t=br.readLine().split("\\ ");
            l=Integer.parseInt(t[0])-Integer.parseInt(t[1]);
            r=Integer.parseInt(t[0])+Integer.parseInt(t[1]);
            arr[i]=new Pair(l,r);
        }
        Arrays.sort(arr);
        int ans=1; int cur=arr[0].r;
        for (int i =1; i < N; i++) {
            if(cur<=arr[i].l){
                cur=arr[i].r; ans++;
            }
        }
        System.out.println(ans);
    }
    
}

