import java.util.*;
import java.lang.*;

class Pair<E,F>{
    E first;
    F second;
    public Pair(E first, F second){
        this.first=first;
        this.second=second;
    }
    public E getFirst(){return first;}
    public F getSecond(){return second;}
    public String toString(){
        return "<"+first.toString()+","+second.toString()+">";
    }
    public int hashCode(){
        return first.hashCode()*30011+second.hashCode()+2;
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pair another = (Pair) obj;
        return this.getFirst().equals(another.getFirst())&&this.getSecond().equals(another.getSecond());
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<Pair<Long,Long>> balls = new HashSet<>();
        for(int n=0; n<N; n++){
            balls.add(new Pair<>(sc.nextLong(), sc.nextLong()));
        }

        int ans = 500000;
        for(Pair<Long,Long> b1:balls)for(Pair<Long,Long> b2:balls)if(!b1.equals(b2)){
            int cur = 0;
            long p = b1.first-b2.first;
            long q = b1.second-b2.second;
            for(Pair<Long,Long> b:balls){
                if(!balls.contains(new Pair<>(b.first-p, b.second-q))) cur++;
            }
            ans = Math.min(ans,cur);
        }

        if(N==1) ans=1;
        System.out.println(ans);
    }
}