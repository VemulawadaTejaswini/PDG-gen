import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int h[] = new int[N];
        for(int i=0;i<N;i++){
            h[i]=sc.nextInt();
        }
        Arrays.sort(h);
        int min=(int)Math.pow(10,9);
        for(int i=0;i<=N-K;i++){
            min=Math.min(min,h[i+K-1]-h[i]);
        }
        System.out.println(min);
    }
}
