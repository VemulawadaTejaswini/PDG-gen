import java.util.*;
public class Main{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		int arr1[]=new int[a];
		int s=0;
		for(int i=0;i<a;i++){
			arr[i]=sc.nextInt();
			arr1[i]=sc.nextInt();
			s+=arr[i];
		}
		Arrays.sort(arr1);
		if(s<=arr1[a-1])
			System.out.println("Yes");
		else System.out.println("No");
	}
}