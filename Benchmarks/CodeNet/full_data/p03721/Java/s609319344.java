import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int k = Integer.parseInt(scan.next());
		int a,b;
		int[] count = new int [100000];
		Arrays.fill(count, 0);
		for (int i =  0;i < n ;++i ){
			a = Integer.parseInt(scan.next());
			b = Integer.parseInt(scan.next());
			count[a-1]+=b;
		}

		int ans=0;
		for(int i = 0;i < 100000; ++i){
			ans+=count[i];
			if (ans>=k){
				System.out.print(i+1);
				break;
			}
		}

	}
}
//end
