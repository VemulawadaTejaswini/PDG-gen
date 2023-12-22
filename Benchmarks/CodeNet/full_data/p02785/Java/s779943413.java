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

        int[] H = new int[N];
        for(int i=0;i<N;i++){
            H[i] = Integer.parseInt(scanner.next());
        }

        Arrays.sort(H);

        int result = 0;

        for(int i=0;i<N-K;i++){
            result += H[i];
        }

        System.out.println(result);
    }
}
