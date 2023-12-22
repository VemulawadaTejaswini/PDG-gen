
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt();
		int n=sc.nextInt();
		int[] a=new int[n];
		int sum=0;
		ArrayList<Integer> aa = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			//a[i]=sc.nextInt();
			int w =sc.nextInt();
			aa.add(w);
		}
		
//		int last =(k-a[a.length-1])-a[0];
//		int last2=a[a.length-1]-a[a.length-2];

		int last=(k-aa.get(aa.size()-1))+aa.get(0);
		int last2 =aa.get(aa.size()-1)-aa.get(aa.size()-2);
		
		if(last<last2) {
			//System.out.println(last);
			aa.remove(aa.size()-1);
			aa.add(last*(-1));
			Collections.sort(aa);
		}
		
		for(int i=0;i<n-1;i++) {
//			sum+=a[i+1]-a[i];
			sum+= aa.get(i+1)-aa.get(i);
		}
		
		System.out.println(sum);
		sc.close();
	}
}
