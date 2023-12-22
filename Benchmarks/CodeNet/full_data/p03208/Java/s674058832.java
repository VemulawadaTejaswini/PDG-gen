import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        List<Integer> A = new ArrayList<>(N);
        for(int i=0; i<N; i++){
            A.add(sc.nextInt());
        }

        int ans = 999999999;
        List<Integer> B;
        int sub;

        Collections.sort(A);

        for(int i=0; i<=(N-K); i++){
            B = A.subList(i,i+K);
            sub = B.get(K-1) - B.get(0);
            if(sub < ans){
                ans = sub;
            }
        }

        System.out.println(ans);
    }
}
