import java.util.*;

class Main{

    public static void main(String args[]) throws Exception{
        Main main = new Main();
    }

    public Main(){
        Scanner scanner = new Scanner(System.in);
        int N,K;
        N = Integer.parseInt(scanner.next());
        K = Integer.parseInt(scanner.next());

        long[] H = new long[N];
        for(int i=0;i<N;i++){
            H[i] = scanner.nextLong();
        }

        Arrays.sort(H);

        long result = 0;

        for(int i=0;i<N-K;i++){
            result += H[i];
        }

        System.out.println(result);
    }
}
