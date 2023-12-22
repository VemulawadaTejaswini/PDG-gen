import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int[] a = new int[n];
		for(int i = 0;i < n; ++i){
			a[i] = Integer.parseInt(scan.next());
		}
		int count = 0;
		for(int i = 0; i < n-1; ++i){
			if(a[i] == a[i+1]){
				a[i+1] = -1;
				++count;
			}
		}
		System.out.print(count);

	}

}


//end
