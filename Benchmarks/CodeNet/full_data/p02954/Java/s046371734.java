import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char []c = sc.next().toCharArray();
		
		int n = c.length;
		int []sum = new int [n];
		

		int count = 0;
		
		for(int i = 0 ; i < n ;i++) {
			if(c[i] == 'R') {
				count++;
			}
			else {
				sum[i] += Math.floorDiv(count, 2);
				sum[i-1] += Math.floorDiv(count, 2) + count % 2;
				count = 0;
			}
		}
		
		count = 0;
		
		for(int j = n-1 ; j >= 0 ; j--) {
			if(c[j] == 'L') {
				count++;
			}
			else {
				sum[j] += Math.floorDiv(count, 2);
				sum[j+1] += Math.floorDiv(count, 2) + count % 2;
				count = 0;
			}
		}
		
		for(int i = 0; i < n ;i++) {
			System.out.print(sum[i] +" ");
		}
		System.out.println("");
		
		

	}

}
