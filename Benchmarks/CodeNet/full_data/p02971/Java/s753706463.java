import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        int N = sc.nextInt();

        List<Integer> A = new ArrayList<>();

        int max = 0;
        int max2 = 0;
        for(int i=0; i<N; i++){
            A.add(Integer.parseInt(sc.next()));
            if(max < A.get(i)){
                max2 = max;
                max = A.get(i);
            }else{
                max2 = Math.max(A.get(i), max2);
            }
        }

        List<Integer> B;
        Integer[] C;
        for(int i=0; i<N; i++){
            if (A.get(i) < max){
                println(max);
            }else{
                println(max2);
            }
            /*
            B = new ArrayList<>(A);
            B.remove(i);
            C = B.toArray(new Integer[N-1]);
            Arrays.sort(C);
            println(C[C.length-1]);
             */
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
