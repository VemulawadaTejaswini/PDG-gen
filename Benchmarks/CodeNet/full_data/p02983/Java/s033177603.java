import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long L = scanner.nextLong();
        long R = scanner.nextLong();

        long N = 2019 *3;

        N = Math.min(L + N, R);

        ArrayList<Long> mods = new ArrayList<>();

        for(long i=L; i<=N; i++){
            mods.add(i % 2019L);
        }

        Collections.sort(mods);

        long ans = Long.MAX_VALUE;

        N = mods.size();

        for(int i=0; i<N-1; i++){
            for(int j=i+1; j<N; j++){
                ans = Math.min(ans, (mods.get(i) * mods.get(j)) % 2019);
            }
        }


        System.out.println(ans);

    }
}