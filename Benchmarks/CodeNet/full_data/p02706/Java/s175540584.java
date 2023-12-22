import java.util.Scanner;
public class Main{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println(answer());
	}
	public static int answer(){
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] arr= new int[m];
		int sum = 0;
		for(int i = 0 ; i < m ; i++){
			arr[i] = scan.nextInt();
			sum += arr[i];
		}
		return n >= sum ?n-sum:-1;
	}
}