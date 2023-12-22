import java.util.*;
public class Main {	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] l = new int[n];
		
		for (int i =0;i<n;i++) {
			x[i]=sc.nextInt();
			l[i]=sc.nextInt();
			
		}

		System.out.println(core(n,x,l));
	}
	
	static int core(int n , int[] x, int[] l ) {
	
		for(int count = 0;count <n-1;count++) {
			int[] conf = countConfflict(n, x, l);
			
			int max = 0;
			int maxi= -1;
			for(int i=0;i<n;i++) {
				if(conf[i] > max) {
					max = conf[i];
					maxi = i;

				}
			}
			if( max == 0)return n - count;

			x[maxi] = -1;
		}		
		
		return 1;
	}

	private static int[] countConfflict(int n, int[] x, int[] l ) {
		
		int conf[] = new int[n];

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j)continue;
				if( x[i]< 0  || x[j] <0)continue;// removed
				if( Math.abs(x[i]-x[j]) < l[i]+l[j]) {
					conf[i]++;
				}

			}
		}
		return conf;
	}


}