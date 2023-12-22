import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		
		long A[] = new long[n];
		
		for(int i=0;i<n;i++) {
			A[i] = Integer.parseInt(sc.next());
		}
		
		sort(A,0,A.length-1);
		
		int play[][] = new int[m][2];
		
		
		for(int i=0;i<m;i++){
			int b = Integer.parseInt(sc.next());
			int c = Integer.parseInt(sc.next());
			
			play[i][0] = b;
			play[i][1] = c;
			
		}
		
		sort2(play,0,m-1);
		long sum =0;
		int count = 0;
		int j;
		for(int i=0;i<m;i++) {
			
			for(j =count;((j-count)<play[m-i-1][0])&&(j<n);j++) {
				if(A[j]>play[m-i-1][1]) {
					break;
				}
				A[j] = play[m-i-1][1];
				
			}
			count += j-count;
		if(j==n)break;
		}
		
		for(int i =0;i<n;i++) {
			sum += A[i];
		}
		
		
		System.out.println(sum);
	}
	
	
	public static void sort(long[] array, int left, int right){
        if(left <= right){
            long p = array[(left + right) >>> 1];
            int l = left;
            int r = right;
            while(l <= r){
                while (array[l] < p){
                    l ++;
                }
                while (array[r] > p){
                    r --;
                }
                if (l <= r){
                    long tmp = array[l];
                    array[l] = array[r];
                    array[r] = tmp;
                    l++ ;
                    r-- ;
                }
            }
            sort(array, left, r);
            sort(array, l, right);
        }
    }
	
	 public static void sort2(int[][] array, int left, int right){
	        if(left <= right){
	            int p = array[(left + right) >>> 1][1];
	            int l = left;
	            int r = right;
	            while(l <= r){
	                while (array[l][1] < p){
	                    l ++;
	                }
	                while (array[r][1] > p){
	                    r --;
	                }
	                if (l <= r){
	                    int tmp = array[l][1];
	                    array[l][1] = array[r][1];
	                    array[r][1] = tmp;
	                     tmp = array[l][0];
	                    array[l][0] = array[r][0];
	                    array[r][0] = tmp;
	                    l++ ;
	                    r-- ;
	                }
	            }
	            sort2(array, left, r);
	            sort2(array, l, right);
	        }
	    }
}