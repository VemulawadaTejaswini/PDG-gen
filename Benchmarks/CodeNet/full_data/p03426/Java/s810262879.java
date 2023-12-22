import java.util.*;
import java.io.*;

/*
   AtCoder contest code
   coder : yoichidon
 */
import java.util.*;
import java.lang.*;
import java.io.*;

class Pair<E extends Comparable<E>,F extends Comparable<F>> implements Comparable<Pair<E,F>>{
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

    public int compareTo(Pair<E,F> another){
        if(this.getFirst().equals(another.getFirst())){
            return this.getSecond().compareTo(another.getSecond());
        }
        return this.getFirst().compareTo(another.getFirst());
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int D = sc.nextInt();

        Map<Integer, Pair<Integer,Integer>> map = new HashMap<>();
        for(int h=0; h<H; h++) for(int w=0; w<W; w++){
            map.put(sc.nextInt()-1, new Pair<>(h,w));
        }
        long[] fromStart = new long[H*W];
        for(int i=0; i<H*W; i++){
            if(i<D) fromStart[i]=0;
            else{
                Pair<Integer,Integer> prev = map.get(i-D);
                Pair<Integer,Integer> cur = map.get(i);
                fromStart[i] = fromStart[i-D] + Math.abs(prev.getFirst()-cur.getFirst()) + Math.abs(prev.getSecond()-cur.getSecond());
            }
        }
        
        int Q = sc.nextInt();
        for(int q=0; q<Q; q++){
            int L = sc.nextInt()-1;
            int R = sc.nextInt()-1;
            System.out.println(fromStart[R] - fromStart[L]);
        }



    }
}
