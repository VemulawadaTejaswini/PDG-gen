import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        int N = sc.nextInt();

        List<Integer> A = new ArrayList<>();

        for(int i=0; i<N; i++){
            A.add(Integer.parseInt(sc.next()));
        }

        List<Integer> B;
        Integer[] C;
        for(int i=0; i<N; i++){
            B = new ArrayList<>(A);
            B.remove(i);
            C = B.toArray(new Integer[N-1]);
            Arrays.sort(C);
            println(C[C.length-1]);
        }
    }

    static void println(Object o){
        PrintWriter out = new PrintWriter(System.out);
        out.println(o);
        out.flush();
    }
   static void print(Object o){
       PrintWriter out = new PrintWriter(System.out);
       out.print(o);
       out.flush();
    }
}
