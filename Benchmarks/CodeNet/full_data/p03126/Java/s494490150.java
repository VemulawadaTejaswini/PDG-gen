import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] cnts= new int[M];

        for(int i=0; i<N; i++){
            int k = scanner.nextInt();
            for(int j=0; j<k; j++){
                int idx = scanner.nextInt();
                idx--;
                cnts[idx]++;
            }
        }

        int cnt = 0;
        for(int i=0; i<M; i++){
            if(cnts[i] == N){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
