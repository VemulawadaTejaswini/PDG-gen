import java.util.*;
import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        League league = new League(N);
        
        for(int i = 0; i < N; i++){
            String[] stdR = br.readLine().split(" ");
            league.A[i] = Stream.of(stdR).mapToInt(Integer::parseInt).map(num -> num - 1).toArray();
        }
        
        league.exec();
    }
}


class League{
    int N;
    int[][] A;
    ArrayDeque<Game> queue;
    ArrayDeque<Game> nextQueue;
    int[] matchOrder;
    boolean[][] done;
    
    public League(int N){
        this.N = N;
        A = new int[N][N-1];
        matchOrder = new int[N];
        done = new boolean[N][N];
    }
    
    public void exec(){
        int ans = 0;
        queue = new ArrayDeque();
        nextQueue = new ArrayDeque();
        
        for(int i = 0; i < N; i++){
            check(i);
        }
        
        while ( !nextQueue.isEmpty() ){
            
            queue = nextQueue;
            nextQueue = new ArrayDeque<Game>();
            ans++;
            
            while( !queue.isEmpty() ) {
                Game game = queue.removeFirst();
                if (done[game.a][game.b] || done[game.b][game.a]) {
                    continue;
                }
                done[game.a][game.b] = true;
                matchOrder[game.a]++;
                matchOrder[game.b]++;
                check(game.a);
                check(game.b);
            }
        }
        
        boolean ok = true;
        for (int i=0; i<N; i++) {
            if (matchOrder[i] != N-1) {
            ok = false;
            break;
            }
        }
        
        System.out.println( ok ? ans : -1);
    }
    
    private void check(int i){
        if (matchOrder[i] >= N - 1) return;
        
        int opponent = A[i][matchOrder[i]];
        
        if (matchOrder[opponent] >= N - 1) return;
        
        if (A[opponent][matchOrder[opponent]] == i ) {
            nextQueue.add(new Game(i, opponent));
        }
    }
}

class Game {
    int a;
    int b;
    
    public Game(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public String toString(){
        return "a=" + a + " " + "b=" + b;
    }
}