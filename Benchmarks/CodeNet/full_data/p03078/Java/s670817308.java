import java.util.*;
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

class Triplet implements Comparable<Triplet>{
    int x,y,z;
    public Triplet(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    Triplet lessX(){
        return new Triplet(x-1,y,z);
    }
    Triplet lessY(){
        return new Triplet(x,y-1,z);
    }
    Triplet lessZ(){
        return new Triplet(x,y,z-1);
    }

    public int compareTo(Triplet another){
        if(this.x!=another.x) return Long.compare(this.x, another.x);
        if(this.y!=another.y) return Long.compare(this.y, another.y);
        return Long.compare(this.z, another.z);
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        return this.compareTo((Triplet)obj)==0;
    }
    public int hashCode(){
        return x + y * 199 + z * 3001;
    }

}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();

        int K = sc.nextInt();

        long[] A = new long[X];
        for(int x=0; x<X; x++) A[x]=sc.nextLong();
        Arrays.sort(A);
        long[] B = new long[Y];
        for(int y=0; y<Y; y++) B[y]=sc.nextLong();
        Arrays.sort(B);
        long[] C = new long[Z];
        for(int z=0; z<Z; z++) C[z]=sc.nextLong();
        Arrays.sort(C);

        Set<Pair<Long, Triplet>> Q = new HashSet<>();
        Q.add(new Pair<>(A[X-1]+B[Y-1]+C[Z-1], new Triplet(X-1,Y-1,Z-1)));

        for(int k=0; k<K; k++){
            long record = 0;
            Pair<Long, Triplet> bestCake = null;
            for(Pair<Long, Triplet> p:Q){
                if(p.getFirst()>record){
                    bestCake = p;
                    record = p.getFirst();
                }
            }
            System.out.println(record);
            //System.err.printf("%12d %4d %4d %4d\n", record, bestCake.second.x, bestCake.second.y, bestCake.second.z);

            Q.remove(bestCake);

            if(bestCake.getSecond().x>0)
                Q.add(new Pair<>(A[bestCake.getSecond().lessX().x]+B[bestCake.getSecond().lessX().y]+C[bestCake.getSecond().lessX().z],
                                 bestCake.getSecond().lessX()));
            if(bestCake.getSecond().y>0)
                Q.add(new Pair<>(A[bestCake.getSecond().lessY().x]+B[bestCake.getSecond().lessY().y]+C[bestCake.getSecond().lessY().z],
                                 bestCake.getSecond().lessY()));
            if(bestCake.getSecond().z>0)
                Q.add(new Pair<>(A[bestCake.getSecond().lessZ().x]+B[bestCake.getSecond().lessZ().y]+C[bestCake.getSecond().lessZ().z],
                                 bestCake.getSecond().lessZ()));

        }

    }
}
