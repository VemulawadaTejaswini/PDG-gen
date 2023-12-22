import java.util.*;

public class Main {
	static int N=26;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int data[] =new int[N];

		ArrayList<Double> ar =new ArrayList<Double>();
	
		for(int i=0;i<data.length;i++) {
			double a=sc.nextInt();
			ar.add(a);
		}
		Collections.sort(ar);
		double tt=ar.get(0);
		ar.remove(0);
		while(true) {
			double t1 =tt+ar.get(0);
			tt= (double)t1 / 2.0;
			ar.remove(0);
			
			if(ar.size()==0)break;
		}
		System.out.println(tt);
		
		
		

	}

}
