import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//
		int n = sc.nextInt();
		int sum = 0;
		for(int i=0; i<n; i++){
			sum += -(sc.nextInt() - sc.nextInt()) + 1;
		}
		System.out.println(sum);
	}
}
