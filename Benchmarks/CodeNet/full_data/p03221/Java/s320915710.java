import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int p[][] = new int[M][3];

		for(int i=0;i<M;i++) {
			p[i][0]=i+1;
			p[i][1]= in.nextInt();
			p[i][2]= in.nextInt();

		}
	    Arrays.sort(p, new Comparator<int[]>() {
	        @Override
	        public int compare(int[] o1, int[] o2) {
	            return o1[2] - o2[2];    //[0] をキーにソート(昇順)
	            //return o2[0] - o1[0];    //[0] をキーにソート(降順)
	        }
	    });
	    Arrays.sort(p, new Comparator<int[]>() {
	        @Override
	        public int compare(int[] o1, int[] o2) {
	            return o1[1] - o2[1];    //[0] をキーにソート(昇順)
	            //return o2[0] - o1[0];    //[0] をキーにソート(降順)
	        }
	    });
	    int p1=1;
	    int sum=0;
	    for (int i = 0; i < M; i++) {
	    	if(p1!=p[i][1]) {
	    		p1=p[i][1];
	    		sum=0;
	    	}
	    	sum++;
	    	p[i][2]=sum;
	    }
	    
	    
	    Arrays.sort(p, new Comparator<int[]>() {
	        @Override
	        public int compare(int[] o1, int[] o2) {
	            return o1[0] - o2[0];    //[0] をキーにソート(昇順)
	            //return o2[0] - o1[0];    //[0] をキーにソート(降順)
	        }
	    });
	    StringBuilder val = new StringBuilder();
		for (int i = 0; i < M; i++) {

			val.append(String.format("%06d",p[i][1])).append(String.format("%06d",p[i][2])).append("\n");
			
		}
		System.out.println(new String(val));
	}
}