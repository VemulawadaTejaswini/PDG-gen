import java.util.Arrays;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	int h = sc.nextInt();
	int [][]x = new int [n][2];
	
	int sum1 = 0;
	
	for(int i = 0; i < n ; i++) {
		x[i][0] = sc.nextInt();
		x[i][1] = sc.nextInt();
		sum1 += x[i][1];
	}
	    Arrays.sort(x,(a, b) -> Integer.compare(a[0],b[0]));
	    int max00 = x[n-1][0];
	    int max01 = x[n-1][1];
	    
	    int sum2 = 0;
	    int count = 0;
	    
	if(sum1 >= h) {
		Arrays.sort(x,(a,b) -> Integer.compare(a[1], b[1]));
			for(int i = n-1; i >= 0 ; i--) {
				if(max00 > x[i][1]) {
					sum2 += x[i][0];
					count++;
				}
				if(max00 <= x[i][1]) {
					sum2 += x[i][1];
					count++;
				}
				if(sum2 >= h)
					break;
			}
			System.out.println(count);	
		}
	if(sum1 < h) {
		sum2 += sum1 - max01;
		count += n-1;
		
		if(max00 >= max01) {
		count += (h - sum2)/max00 + 1;
		System.out.println(count);
		}
		
		if(max00 < max01) {
		   if(sum2 + max01 >= h) {
			   count++;
			   System.out.println(count);
		   }
		   else {
		   count += (h-sum2-max01)/max00 + 1;
		   System.out.println(count);
		  
		   }
			   
		}
	}		
	}
	    
}


