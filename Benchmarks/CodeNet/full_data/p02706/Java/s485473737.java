import java.util.Scanner;
public class Dreamoon{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int n  = input.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++){
			arr[i] = input.nextInt();
		}
		int sum = 0;
		for(int i = 0; i < arr.length;i++){
			sum +=arr[i];
		}
		System.out.println(num - sum);
		
	}
}