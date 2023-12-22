import java.io.*;
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
    static boolean ithBit(long p, int i){
        return (p & (1<<i)) > 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Pair<Integer,Integer>[] cards = new Pair[N];
        int[] A = new int[N];
        for(int n=0; n<N; n++) A[n]=sc.nextInt();
        int[] B = new int[N];
        for(int n=0; n<N; n++) B[n]=sc.nextInt();

        for(int n=0; n<N; n++) cards[n] = new Pair<>(A[n],B[n]);


        long flipPattern = 1<<N;
        int ans = 100000000;
        boolean found = false;

        for(int p=0; p<flipPattern; p++){

            int[] cardLine = new int[N];
            int flipedCards = 0;
            for(int n=0; n<N; n++){
                if(ithBit(p,n)) flipedCards++;
                cardLine[n] = ithBit(p, n) ? cards[n].second : cards[n].first;
            }
            if(flipedCards%2==1){

                continue;
            }
            Arrays.sort(cardLine);

            int[] det = new int[N]; Arrays.fill(det, -1);
            for(int from=0; from<N; from++){
                for(int to=((ithBit(p,from)?1:0)+from)%2; to<N; to+=2){
                    if((ithBit(p, from) ? cards[from].second : cards[from].first) == cardLine[to] && det[to]<0){
                        det[to] = from;
                    }
                }
            }

            boolean properFlip = true;
            for(int n=0; n<N; n++) if(det[n]<0) properFlip=false;
            if(!properFlip) continue;
            int inv =0;
            for(int i=0; i<N; i++) for(int j=i+1; j<N; j++) if(det[i]>det[j]) inv++;
            found=true;

            ans = Math.min(ans,inv);
        }


        System.out.println(found ? ans : -1);
    }


}
