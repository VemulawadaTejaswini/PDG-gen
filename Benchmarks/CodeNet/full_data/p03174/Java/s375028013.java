import java.util.*;

public class Main {
    private final static int M = 1000000007;

    private static int solve(int N, boolean[][] a) {
        int states = 1 << N;
        int[] count = new int[states];
        boolean[] added = new boolean[states];
      
        Queue<Item> q = new ArrayDeque<>();
        q.add(new Item(0, 0));
        count[0] = 1;
      
        while (!q.isEmpty()){
          Item item = q.poll();
          int state = item.state;
          int i = item.pos;
          
          for (int j = 0; j < N; j++) {
            if (!a[i][j]) continue;

            int newState = state | (1 << j);
            if (newState == state) continue;
            count[newState] = (count[newState] + count[state]) % M;
            
            if (i+1 < N && !added[newState]){
              q.add(new Item(newState, i+1));
              added[newState] = true;
            }
          }
        }

        return count[states-1];
    }
  
   static class Item{
     public int state;
     public int pos;
     public Item(int state, int pos){
       this.state = state;
       this.pos = pos;
     }
   }

    public static int run(Scanner scanner) {
        int N = scanner.nextInt();
        boolean[][] a = new boolean[N][N];
        for (int i=0; i < N; i++)
            for (int j=0; j < N; j++)
                a[i][j] = scanner.nextInt() == 1;

        return solve(N, a);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(run(scanner));
        }
        //Tests.run();
    }
}