import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = bf.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int K = Integer.parseInt(arr[1]);
        int Q = Integer.parseInt(arr[2]);
        int[] players = new int[N+1];
        for(int i=1; i<players.length; i++) {
            players[i] = K - Q;
        }
        for(int i=0; i<Q; i++) {
            int n = Integer.parseInt(bf.readLine());
            players[n]++;
        }
        for(int i=1; i<players.length; i++) {
            if(players[i] <= 0) System.out.println("No");
            else System.out.println("Yes");
        }
    }

}