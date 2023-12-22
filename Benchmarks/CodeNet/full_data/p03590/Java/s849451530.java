import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
	static int N;
	static long K;
	static long[][] S;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			 N = sc.nextInt();
			 K = sc.nextLong();

			 S = new long[N][2];
			 for(int i = 0 ; i < N ; i++){
				 for(int j = 0 ; j < 2 ; j++){
					 S[i][j] = sc.nextInt();
				 }
			 }
		sc.close();

		//String bin = Long.toBinaryString(K);
		//System.out.println(bin);
		//System.out.println(bin.length());

	    Arrays.sort(S, new Comparator<long[]>() {
	        public int compare(long[] o1, long[] o2) {
	            return (int) (o2[1] - o1[1]);
	        }
	    });

	    long tmp = 0 ;
	    long tmp2 = 0;
	    long ans = 0 ;
	    long ans2= 0;
	    for(int i = 0 ; i < S.length ; i++){
	    	tmp2 = tmp;
	    	tmp = tmp|S[i][0];
	    	//System.out.println("tmp "+tmp);
	    	if(tmp<=K){
	    		ans = tmp;
	    		//System.out.println("ans "+ans);
	    		ans2 += S[i][1];
	    		//System.out.println("ans2 "+ans2);
	    	}
	    	else{
	    		tmp = tmp2;
	    		continue;
	    	}
	    }
	    System.out.println(ans2);
	}
}