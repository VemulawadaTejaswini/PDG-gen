import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
		int[] a = new int[i];
		
		
		for(int j = 0; j < a.length; j++) {
			a[j] = j + 1;
		}
		
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		int sum = i*(i+1)/2;
		
		for(int k = 0; k < a.length; k++) {
			if((k+1)%3 == 0) {
				sum1 += k+1;
			}else if((k+1)%5 == 0){
				sum2 += k+1;
			}else if((k+1)%15 == 0) {
				sum3 += k+1;
			}
		}
		
		sum4 = sum - sum1 - sum2 + sum3;
		
		System.out.println(sum4);
				
		}	
 	}