import java.util.Scanner;
import java.util.Arrays;
public class Main{
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner (System.in);
		
		int[] a = new int[3];
		
		a[0] = scan.nextInt();
		a[1] = scan.nextInt();
		a[2] = scan.nextInt();
		
		if((a[0]%2==0)||(a[1]%2==0)||(a[2]%2==0)){
			System.out.println("0");
		} else {
			Arrays.sort(a);
			System.out.println(a[0]*a[1]);
		}
	}
}