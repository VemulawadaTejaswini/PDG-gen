
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String[] nk = line.split(" ");
        int N = Integer.parseInt(nk[0]);
        int K = Integer.parseInt(nk[1]);

        String[] diceStr = sc.nextLine().split(" ");
        Integer[] dice = new Integer[N];
        for(int i = 0; i < diceStr.length ; i++) {
        	dice[i] = Integer.parseInt(diceStr[i]);
        }
        sc.close();

        int max = 0;
        int maxKSta = 1;
        int comp1 = 0;
        double work=0.0000;
        double ans = 0.0000;

        for(int i=0; i< K; i++) {
        	max += dice[i];
        }
        for(int i = 1; i<= dice.length-K; i++) {
        	for(int j = 0; j < K ; j++) {
        		comp1 += dice[i+j];
        	}
        	if(max < comp1) {
        		max = comp1;
        		maxKSta = i;
        	}

        	comp1 =0;
        }
        for(int i = maxKSta; i < maxKSta + K; i++) {
        	for(int j=1 ; j<=dice[i]; j++) {
        		work += j;
        	}
        	ans += work/dice[i];
        	work=0;
        }
        System.out.println(ans);

	}

}
