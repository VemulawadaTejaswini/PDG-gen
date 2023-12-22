import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			int a=scn.nextInt();
			arr.add(a);
		}if(n==1) {
			System.out.println(0);
			return;
		}int i=0;
		int j=1;
		int ans=0;
		while(i<arr.size()) {
			if(arr.get(i)!=j) {
				arr.remove(i);
				ans++;
			}else {
				i++;
				j++;
			}
		}if(n==ans) {
			ans=-1;
		}
		System.out.println(ans);
	}
}