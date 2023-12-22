import java.util.Scanner;
public class Main{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int []array=new int[2];
		int sum=0;
		for(int i=0;i<2;i++) {
			array[i]=sc.nextInt();
		}
		int []arr=new int[array[1]];
		for(int i=0;i<array[1];i++) {
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		if(sum<array[0])
		  System.out.println("No");
		else
			System.out.println("Yes");
	}
	
}