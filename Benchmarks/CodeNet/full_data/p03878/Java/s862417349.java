import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long minimum=0;
		long cnt=0;
		ArrayList<Long> a = new ArrayList<Long>();
		ArrayList<Long> b = new ArrayList<Long>();

		for(int i=0;i<N;i++){
			a.add(sc.nextLong());
		}
		for(int i=0;i<N;i++){
			b.add(sc.nextLong());
		}
		Collections.sort(a);
		Collections.sort(b);

		for(int i=0;i<N;i++){
			minimum+=Math.abs(a.get(i)-b.get(i));
		}
		cnt++;
		//System.out.println(minimum);
		long distance=minimum;
		int i;
		for(i=1;minimum==distance&&i<N;i++){
			distance=0;
			distance+=Math.abs(a.get(0)-b.get(i));
			for(int j=0;j<i;j++){
					distance+=Math.abs(a.get(j+1)-b.get(j));
			}
			for(int k=i+1;k<N;k++){
				distance+=Math.abs(a.get(k)-b.get(k));
			}
			if(minimum==distance){
				cnt++;
			}
			//System.out.println(distance);
		}
		System.out.println(cnt%(10^9+7));
	}
}