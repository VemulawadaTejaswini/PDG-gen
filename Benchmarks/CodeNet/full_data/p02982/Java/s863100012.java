import java.util.*;
import java.io.*;

class Point{
    int dim;
    int[] cood;
    public Point(int[] c){
        this.cood = c;
        this.dim = c.length;
    }
    int sqDistance(Point another){
        int ans = 0;
        for(int d=0; d<dim; d++) ans += (this.cood[d]-another.cood[d])*(this.cood[d]-another.cood[d]);
        return ans;
    }
}
public class Main {
    static boolean isSquare(int n){
        for(int i=0; i*i<=n; i++) if(i*i==n) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        Point[] p = new Point[N];
        for(int n=0; n<N; n++){
            int[] c = new int[D];
            for(int d=0; d<D; d++) c[d] = sc.nextInt();
            p[n] = new Point(c);
        }
        int ans = 0;
        for(int i=0; i<N; i++) for(int j=i+1; j<N; j++){
            if(isSquare(p[i].sqDistance(p[j]))) ans++;
        }
        System.out.println(ans);

    }
}