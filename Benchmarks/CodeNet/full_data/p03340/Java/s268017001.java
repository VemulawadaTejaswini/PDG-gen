import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n+1];
		int c[] = new int[n+1];
 
		a[0] =sc.nextInt();
		b[0] = 0;
		c[0] = 0;
		b[1] = a[0];
		c[1] = a[0];
 
		for(int i=1;i<n;i++){
			a[i] = sc.nextInt();
			b[i+1] = b[i] + a[i];
			c[i+1] = c[i]^a[i];
		}
 
		int num = 0;
 
		int sum =0;
		int sumb = 0;
 
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				sum = b[j+1] - b[i];
				sumb = c[j+1]^c[i];
				
				if(sum == sumb){
					num += 1;
				}else{
					break;
				}
			}
		}
 
		System.out.println(num);
	}
 
}