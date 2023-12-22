import java.util.*;
import java.lang.Math;

public class Main{
	public static void main(String ards[]){
    	Scanner sc = new Scanner(System.in);
    	long N = sc.nextLong();
      	long[] A = new long[(int)N+10];
      	for(int i=0;i<N;i++){
        	A[i] = sc.nextLong();
        }
      
      	long tate =0L;
      	long yoko =0L;
      	quick_sort(A,0,(int)N-1);
      	for(int i =(int)N-1;i>=1;i--){
        	if(tate ==0L){
            	if(A[i]==A[i-1]){
                	tate = A[i];
                    i--;
                }
            }else if(yoko == 0L){
            	if(A[i]==A[i-1]){
                	yoko = A[i];
                }
            }else{
            	break;
            }
        }
        System.out.println(tate*yoko);
    }
  
      static void quick_sort(long[] d, int left, int right) {
        if (left>=right) {
            return;
        }
        long p = d[(left+right)/2];
        int l = left, r = right;
        long tmp;
        while(l<=r) {
            while(d[l] < p) { l++; }
            while(d[r] > p) { r--; }
            if (l<=r) {
                tmp = d[l]; d[l] = d[r]; d[r] = tmp;
                l++; r--;
            }
        }
        quick_sort(d, left, r); 
        quick_sort(d, l, right); 
    }
}