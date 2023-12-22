import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		Arrays.sort(arr);
		int x = n/2;
		int y = n/2-1;
		x = arr[x];
		y=arr[y];
		
		System.out.println(x-y);
		

	}

}
