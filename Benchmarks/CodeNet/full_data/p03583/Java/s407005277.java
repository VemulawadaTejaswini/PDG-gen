
import java.util.Scanner;

public class Main{
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		double X = (double)3 * n /4; 
		
		int ans1= 0;
		int ans2 = 0;
		int ans3 = 0;
		if(n == 2) {
			System.out.println(2+" "+2+" "+1);
			return;
		}
		
	f:	for(int i = 1 ; i <= X ; i++) {
			for(int j = n % 4 == 0 ? 3*n/4 : 1+((3*n)/4) ; j <= 3500 ; j++) {
				int h = j;
				int l = i;
				while(h - l >= 1) {
					int mid = ((h+l)/2);
					//System.out.println(h+" "+l+" "+mid);
					long temp = (long)((4*h*l)-n*(h+l)) * mid;
					if(temp == (long)n*h*l) {
						
						ans1 = h;	ans2 = l; ans3 = mid;
						break f;
					}
					if(h - l == 1) break;
					
					if(temp > h*l*n) {
						h = mid;
					}
					else {
						l = mid;
					}
				}	
			}
		}
		System.out.println(ans1+" "+ans2+" "+ans3);
		
		}	
	}

