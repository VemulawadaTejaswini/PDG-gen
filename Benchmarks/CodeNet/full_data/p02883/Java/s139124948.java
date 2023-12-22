import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        int[] A = new int[N];
        int[] F = new int[N];
        long allcost = 0;

        for(int i=0; i<N; i++){
            A[i]=sc.nextInt();
            allcost = allcost + A[i];
        }

        for(int i=0; i<N; i++){
            F[i]=sc.nextInt();
        }

        if(allcost<=K){
            System.out.println(0);
            return;
        }else{
            Arrays.sort(A);
            Arrays.sort(F);

            long ok = A[N-1]*F[N-1];
            long ng = 0;

            while(ok-ng>1){
                long h = (ok+ng)/2;
                long tot = 0;
                for(int i=0; i<N; i++){
                    tot = tot+Math.max(A[i]-h/F[N-1-i], 0);
                }
                if(tot>K){
                    ng = h;
                }else{
                    ok = h;
                }
            }
            System.out.println(ok);
        }
    }
}