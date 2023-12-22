import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []a = new int [n];
		
		for(int i = 0; i < n ;i++) {
			a[i] = sc.nextInt();
		}
		
		sc.close();
		
		long []sum = new long [n];
		int []temp = new int [n];
		long count = 0;
		
		sum[0] = a[0];
		if(a[0] > 0) {
			temp[0] = 1;
		}
		if(a[0] < 0) {
			temp[0] = -1;
		}
		if(a[0] == 0) {
			if(a[1] >0) {
				 count++;
				temp[0] = -1;
				sum[0] = -1;
			}
			else {
				count++;
				temp[0] = 1;
				sum[0] = 1;
			}
		}
		for(int i = 1 ; i < n ; i++) {
			sum[i] +=(long) a[i] + sum[i-1];
			
			if(sum[i] >0) {
				temp[i] = 1;
			}
			
			if(sum[i] < 0){
				temp[i] = -1;
			}
						
			if(temp[i-1] * temp [i] > 0) {
				count += Math.abs(sum[i]) + 1;
				sum[i] = temp[i] * -1;
				temp[i] = temp[i] * -1;
			}
			if(temp[i] == 0) { 
				count++;
				sum[i] = temp[i-1] * -1;
				temp[i] = (int)sum[i];
			}
			
		}
		System.out.println(count);
	}

}
