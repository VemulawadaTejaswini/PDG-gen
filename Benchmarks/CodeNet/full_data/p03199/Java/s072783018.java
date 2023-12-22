import java.util.*;
import java.io.*;

/*
   AtCoder contest code
   coder : yoichidon
 */

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

    public Pair<F,E> reverse(){
        return new Pair<>(second, first);
    }
}

class Mod{
    static final int MOD = 998244353;
    public static long add(long a, long b){
        long tmp = (a+b)%MOD;
        return tmp>=0 ? tmp : tmp+MOD;
    }
    public static long sub(long a, long b){
        return add(a,-b);
    }
    public static long mult(long a, long b){
        long tmp = (a*b)%MOD;
        return tmp>=0 ? tmp : tmp+MOD;
    }
    public static long power(long a, long x){ //calculate a^x
        if(x<0)return 0;
        if(x==0)return 1;
        if(x%2==0) {
            long half = power(a,x/2);
            return mult(half,half);
        }
        return (a*power(a,x-1)) % MOD;
    }
    public static long inverse(long a){
        return power(a,MOD-2);
    }
    public static long div(long a, long b){
        return mult(a, inverse(b));
    }

}

class Board{
    int size;
    Map<Pair<Integer,Integer>, Integer> fixed;
    boolean contradiction;

    long noCenterLineBlank;

    public Board(int s){
        size = s;
        fixed = new HashMap<>();
        contradiction = false;

        noCenterLineBlank = ((long)(size-3))*(size-2);
    }

    public void fix(int x, int y, int value){
        Pair<Integer,Integer> cood = new Pair(x,y);

        switch(Math.abs(x-y)){
            case 0 :
            case 1 :
            case 2 :
                if(fixed.containsKey(cood)){
                    if(fixed.get(cood)!=value)contradiction = true;
                }
                fixed.put(cood, value);
                break;
            default :
                if(fixed.containsKey(cood)){
                    if(fixed.get(cood)!=value)contradiction = true;
                }else{
                    noCenterLineBlank--;
                }
                if(fixed.containsKey(cood.reverse())){
                    if(fixed.get(cood.reverse())!=value) contradiction = true;
                }else{
                    noCenterLineBlank--;
                }
                fixed.put(cood, value);
                fixed.put(cood.reverse(), value);
                break;
        }

    }
    public void fix(Pair<Integer,Integer> cood, int value){
        fix(cood.getFirst(), cood.getSecond(), value);
    }
    public long check(){

        long ans = Mod.power(2, noCenterLineBlank/2);
        //3*3
        for(int i=2; i<=size-1; i++){
            Pair<Integer,Integer> UR = new Pair(i-1,i+1);
            Pair<Integer,Integer> DL = new Pair(i+1,i-1);

            if(fixed.containsKey(DL) && fixed.containsKey(UR)){
                //System.err.println(i+".");
                fix(i,i, fixed.get(DL) ^ fixed.get(UR));
            }
            else if(!fixed.containsKey(DL) && !fixed.containsKey(UR)){
                //System.err.println(i+"!");
                ans = Mod.mult(ans,2);
            }else{
                //System.err.println(i+"?");
                ans = Mod.mult(ans,1);
            }
        }

        //2*2
        for(int i=1; i<size; i++){
            Pair<Integer,Integer> UL = new Pair(i,i);
            Pair<Integer,Integer> UR = new Pair(i,i+1);
            Pair<Integer,Integer> DL = new Pair(i+1,i);
            Pair<Integer,Integer> DR = new Pair(i+1,i+1);
            int fixedCount = (fixed.containsKey(UL)?1:0)+(fixed.containsKey(UR)?1:0)+
                    (fixed.containsKey(DL)?1:0);
            boolean DRFixed = fixed.containsKey(DR);
            //System.err.println(i+" "+fixedCount);
            switch(fixedCount){
                case 0 :
                    ans = Mod.mult(ans,4);
                    break;
                case 1 :
                    ans = Mod.mult(ans,2);
                    break;
                case 2 :
                    ans = Mod.mult(ans,1);
                    break;
                case 3 :
                        fix(DR, fixed.get(UL)^fixed.get(UR)^fixed.get(DL));
            }
            //System.err.println(fixed);
        }
        if(!fixed.containsKey(new Pair(size,size))) ans = Mod.mult(ans,2);
        return contradiction ? 0 : ans;

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        Board board = new Board(N);
        for(int m=0; m<M; m++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            board.fix(a,b,c);
        }

        System.out.println(board.check());

    }
}
