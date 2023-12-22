import java.util.*;
import java.lang.*;


public class Main {
    static boolean canEat(ArrayList<Long> A, ArrayList<Long> F, long K, long limitTime){
        int N = A.size();
        long k = 0;
        for(int n=0; n<N; n++){
            k += (A.get(n)-(limitTime/F.get(n)));
        }
        return k<=K;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();

        ArrayList<Long> A = new ArrayList<>(N);
        for(int n=0; n<N; n++) A.add(sc.nextLong());
        Collections.sort(A);

        ArrayList<Long> F = new ArrayList<>(N);
        for(int n=0; n<N; n++) F.add(sc.nextLong());
        Collections.sort(F, Collections.reverseOrder());

        long tooShort = -1;
        long longEnough = 5_000_000_000_000_000L;
        while(longEnough-tooShort>1){
            long mid = (tooShort+longEnough)/2;
            if(canEat(A,F,K,mid)) longEnough = mid;
            else tooShort = mid;
        }

        System.out.println(longEnough);

    }
}
