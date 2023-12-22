import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(sc.next());
        String[] allN = new String[N];
        int[][] town = new int[N][2];
        Deque<String> q = new ArrayDeque<String>();
        for (int i = 0; i < N; i++){
            town[i][0] = Integer.parseInt(sc.next());
            town[i][1] = Integer.parseInt(sc.next());
            allN[i] = Integer.toString(i);
            q.addLast(Integer.toString(i));
        }
        
        int perm = N;
        String order;
        for (int i = 1; i < N; i++){
            for (int j = 0; j < perm; j++){
                order = q.pollFirst();
                for (int k = 0; k < N; k++){
                    if (!order.contains(allN[k])){
                        q.addLast(order+allN[k]);
                    }
                }
            }
            perm *= (N - i);
        }

        float Dist = 0;
        float currDist;
        int a, b;
        for (int j = 0; j < perm; j++){
            order = q.pollFirst();
            //out.println(order);
            currDist = 0;
            for (int i=0; i < N -1; i++){
                a = Integer.valueOf(order.substring(i, i+1));
                b = Integer.valueOf(order.substring(i+1, i+2));
                currDist += Math.sqrt(Math.pow((town[a][0] - town[b][0]), 2) + Math.pow((town[a][1]-town[b][1]), 2));
            }
            Dist += currDist;
        }
        out.println(Dist / perm);

        //テンプレ
        sc.close();
        out.flush();
    }
}