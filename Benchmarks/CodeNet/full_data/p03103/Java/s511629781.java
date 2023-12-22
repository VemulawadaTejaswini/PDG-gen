import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numN = in.nextInt();
		int numM = in.nextInt();
		
		long[] arrayA = new long[numN];
		long[] arrayB = new long[numN];
		
		for(int i = 0; i< numN; i++){
			arrayA[i] = in.nextInt();
			arrayB[i] = in.nextInt();
		}
		
		quick_sort(arrayA, arrayB, 0, numN -1);
		
		long result = 0;
		int drnkCnt = 0;
		for(int i = 0; i< numN; i++){
			if(drnkCnt + arrayB[i] >= numM){
				long tmpL = 0;
				long tmpR = arrayB[i];
				while(tmpL <= tmpR){
					long M  = (tmpL+tmpR)/2;
					if((drnkCnt + M) == numM ){
						result +=arrayA[i]* (M);
						drnkCnt += (M);
						break;
					}else if ((drnkCnt + M) > numM) {
						tmpR = M;
					}else{
					    tmpL = 	M+1;
					}
				}
			}else{
				result +=arrayA[i]*arrayB[i];
				drnkCnt += arrayB[i];
			}
			if(drnkCnt == numM)break;
		}
		System.out.println(result);
		
		in.close();
	}
	static void quick_sort(long[] d,long[] s, int left, int right) {
		if (left >= right) {
			return;
		}
		long p = d[(left + right) / 2];
		int l = left;
		int r = right;
		long tmp;
		long tmp2;
		while (l <= r) {
			while (d[l] < p) {
				l++;
			}
			while (d[r] > p) {
				r--;
			}
			if (l <= r) {
				tmp = d[l];
				d[l] = d[r];
				d[r] = tmp;
				
				tmp2 = s[l];
				s[l] = s[r];
				s[r] = tmp2;
				l++;
				r--;
			}
		}
		quick_sort(d,s, left, r); 
		quick_sort(d,s, l, right);
	}
}
