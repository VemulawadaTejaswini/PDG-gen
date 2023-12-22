import java.io.PrintWriter;
import java.util.*;

public class Main {

    static String br = System.getProperty("line.separator");

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N];

        int max = 0;
        int max2 = 0;
        List<Integer> maxIndex = new ArrayList<>();
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(sc.next());
            A[i] = num;
            if(max < num){
                max2 = max;
                max = num;
                maxIndex.add(i);
            }else{
                max2 = Math.max(A[i], max2);
            }
        }

        int[] B = new int[N];
        Arrays.fill(B, max);

        for(int index : maxIndex){
            B[index] = max2;
        }


        String message = "";
        for(int i=0; i<N; i++){
            message += B[i] + br;
        }

        print(message);
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
