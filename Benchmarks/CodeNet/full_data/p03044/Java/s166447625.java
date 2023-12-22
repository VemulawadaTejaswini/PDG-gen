import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

//方針はBFS
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<List<Integer>> edge = new ArrayList<>(N+1);
        List<List<Integer>> cost = new ArrayList<>(N+1);
        for(int i=1;i<=N+1;i++){
          edge.add(new ArrayList<>());
          cost.add(new ArrayList<>());
        }

        for(int i=1;i<=N;i++){
          edge.get(i).add(0);
          cost.get(i).add(0);
        }

        for(int i=1;i<=N-1;i++){
          int u = sc.nextInt();
          int v = sc.nextInt();
          int w = sc.nextInt();

            edge.get(u).add(v);
            edge.get(v).add(u);
            cost.get(u).add(w);
            cost.get(v).add(w);

        }


        Deque <Integer> dq = new ArrayDeque<>();
        int status [] = new int[N+1];
        int ans [] = new int[N+1];
        int chakushuzumi = 0;


        for(int i=1;i<=N;i++){
            ans[i]=0;
            status[i]=0;
        }
        dq.push(1);
        status[1]=1;
        while(!dq.isEmpty()){
            int first_in = dq.pollLast();
            //
            for(int i=1;i<=edge.get(first_in).size()-1;i++){
                if(status[i]==0){
                    dq.push(edge.get(first_in).get(i));
                    status[edge.get(first_in).get(i)]=1;
                    int w = cost.get(first_in).get(i);
                    ans[edge.get(first_in).get(i)]=(ans[first_in] + w) % 2;
                    }
                }
      }
        for(int j=1;j<=N;j++) {
            System.out.println(ans[j]);
        }
    }
}