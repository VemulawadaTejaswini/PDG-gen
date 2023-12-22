import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		
		int temp=0;
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {		
			temp+=arr[i];
			min=Math.min(min, Math.abs(sum-2*temp));
		}
		
		System.out.println(min);
	}
