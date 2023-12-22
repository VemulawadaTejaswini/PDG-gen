import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;

class Stop implements Comparable<Stop>{
    int s; int t; int x; int start; int end;
    public Stop(int s, int t, int x){
        this.s = s;
        this.t = t;
        this.x = x;
        this.start = this.s - this.x;
        this.end = this.t - this.x;
    }
    @Override
    public int compareTo(Stop m){
        if(this.start == m.start){
            if(this.end == m.end){
                return m.x - this.x;
            }
            return m.end - this.end;
        }
        return this.start - m.start;
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        ArrayList<Stop> m = new ArrayList<Stop>();
        for(int i=0;i<n;i++){
            int s = Integer.parseInt(sc.next());
            int t = Integer.parseInt(sc.next());
            int x = Integer.parseInt(sc.next());
            if(t < x){
                break;
            }
            m.add(new Stop(s,t,x));
        }
        Collections.sort(m);
        for(int i=0;i<n-1;i++){
            int a = m.get(i).start;
            int b = m.get(i+1).start;
            if(a == b){
                m.remove(i+1);
                i--;
              	n--;
            }
        }
      	m.sort((a,b) -> a.x - b.x);
        for(int i=0;i<q;i++){
            int cur = m.get(0).x;
            int d = Integer.parseInt(sc.next());
            for(int j=0;j<n;j++){
                if(m.get(j).s <= d+cur && d+cur < m.get(j).t){
                    System.out.println(cur);
                    break;
                }else{
                    if(j==n-1){
                        System.out.println(-1);
                        break;
                    }else{
                        cur = Math.max(cur, m.get(j+1).x);
                    }
                }
            }
        }
        sc.close();
    }
}