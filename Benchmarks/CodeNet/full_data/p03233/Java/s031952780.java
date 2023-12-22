import java.util.*;
import java.lang.*;
import java.io.*;
class Pair<E extends Comparable<E> ,F extends Comparable<F> > implements Comparable<Pair<E,F>>{
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
    public int compareTo(Pair<E,F> another){
    	if(!(this.getFirst().equals(another.getFirst()))){
    		return this.getFirst().compareTo(another.getFirst());
    	}
    	return this.getSecond().compareTo(another.getSecond());
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Pair<Long, Pair<Integer,Integer>>> points = new ArrayList<>();
        //(p, (n,0)) : A_n
        //(p, (n,1)) : B_n
        for(int n=0;n<N;n++){
        	points.add(new Pair(sc.nextLong(), new Pair(n,0)));
        	points.add(new Pair(sc.nextLong(), new Pair(n,1)));
        }
        
        Collections.sort(points);
        
        long ans = 0;
        boolean[] selected = new boolean[N];
        for(int n=0;n<N;n++) selected[n]=false;
        int A = 0, B = 0;
        for(int n=0;n<N;n++){
        	Pair<Long, Pair<Integer,Integer>> data = points.get(n);
        	ans += points.get(n).getFirst();
        	Pair<Integer,Integer> sec = data.getSecond();
        	selected[sec.getFirst()] = true;
        	if(sec.getSecond()==0) A++; 
        	else B++;
        }
        boolean all = true;
        for(int n=0;n<N;n++) all = all && selected[n];
        if(all){
        	if(A!=0 && B!=0){
        		Pair<Long, Pair<Integer,Integer>> next = points.get(N);
        		if(next.getSecond().getFirst()==points.get(N-1).getSecond().getFirst()){
        			ans = Math.min(
        				      ans + points.get(N).getFirst() - points.get(N-2).getFirst(),
        				      ans + points.get(N+1).getFirst() - points.get(N-1).getFirst()
        				  );
        		}else{
        			ans = ans + next.getFirst() - points.get(N-1).getFirst();
        		}
        	}
        }
        System.out.println(ans);
        
    }
}
