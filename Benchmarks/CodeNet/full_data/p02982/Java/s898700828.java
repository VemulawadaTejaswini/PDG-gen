import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int D = scanner.nextInt();

        HashSet<Long> hashSet = new HashSet<>();

        for(long i=0; i<1000; i++){
            hashSet.add(i*i);
        }


        int[][] vectors = new int[N][D];

        for(int i=0; i<N; i++){
            for(int j=0; j<D; j++){
                vectors[i][j] = scanner.nextInt();
            }
        }

        long ans = 0;

        for(int i=0; i<N-1; i++){
            for(int j=i+1; j<N; j++){
                long tmp = 0;
                for(int k=0; k<D; k++){
                    tmp += (vectors[i][k] - vectors[j][k]) * (vectors[i][k] - vectors[j][k]) ;
                }

                if(hashSet.contains(tmp)){
                    ans++;
                }
            }
        }

        System.out.println(ans);

    }
}
