import java.util.Scanner;

class Main{
	static int[][] yobo;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();

		yobo=new int[M][2];
		int[] range=new int[2];
		int hashi=1;

		for(int i=0; i<M; i++) {
			yobo[i][0]=sc.nextInt();
			yobo[i][1]=sc.nextInt();
		}
		quick_sort(yobo, 0, M-1);
		for(int i=0; i<M; i++) {
			if(i==0) {
				range[0]=yobo[0][0];
				range[1]=yobo[0][1];
			}
			else {
				if(Math.min(range[1],yobo[i][1])-Math.max(yobo[i][0], range[0])>=1) {
					range[0]=Math.max(yobo[i][0], range[0]);
					range[1]=Math.min(yobo[i][1], range[1]);
				}
				else {
					hashi++;
					range[0]=yobo[i][0];
					range[1]=yobo[i][1];
				}
			}
		}
		System.out.println(hashi);
	}
	    static void quick_sort(int[][] d, int left, int right) {
	        if (left>=right) {
	            return;
	        }
	        int p = d[(left+right)/2][0];
	        int l = left, r = right, tmp,tmp1,tmp2;
	        while(l<=r) {
	            while(d[l][0] < p) { l++; }
	            while(d[r][0] > p) { r--; }
	            if (l<=r) {
	                tmp = d[l][0]; d[l][0] = d[r][0]; d[r][0] = tmp;
	                tmp1=d[l][1]; tmp2=d[r][1]; d[l][1]=tmp2; d[r][1]=tmp1;
	                l++; r--;
	            }
	        }
	        quick_sort(d, left, r);
	        quick_sort(d, l, right);
	    }
}