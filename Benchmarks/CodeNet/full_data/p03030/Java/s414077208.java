
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


class Triplet<T1, T2, T3> {

    public T1 x;
    public T2 y;
    public T3 z;

    public Triplet(T1 x, T2 y, T3 z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public String toString() {
        return "(" + x + ", " + y + "," + z + ")";
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        Triplet<String, Integer, Integer>[] entries = new Triplet[n];

        for(int i=0;i<n;i++){
            entries[i] = new Triplet<>(in.next(), in.nextInt(), i+1);
        }

        Comparator<Triplet<String, Integer, Integer>> cmpx = Comparator.comparing(v -> v.x);
        Comparator<Triplet<String, Integer, Integer>> cmpy = Comparator.comparing(v->v.y);
        Arrays.sort(entries, cmpx.thenComparing(cmpy.reversed()));

        for(int i=0;i<n;i++){
            System.out.println(entries[i].z);
        }

    }
}
