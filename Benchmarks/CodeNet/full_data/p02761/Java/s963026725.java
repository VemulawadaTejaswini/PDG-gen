import java.util.*;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt(),M=sc.nextInt();//,s[]=new int[M],c[] = new int[M];
		Map <Integer,Integer> m = new HashMap<Integer,Integer>();
		int ans[] = new int[N];
		Arrays.fill(ans, 0);
		boolean f=true;
		for(int i=0;i<M;i++) {
			int temp = sc.nextInt();
			int temp1 = sc.nextInt();
			if(m.containsKey(temp)) {
				if (m.get(temp) != temp1) {
					f = false;
					break;
				}
			}
			m.put(temp,temp1);
		}
		m.forEach((k,v) -> {
			ans[k-1]=v;
		});
		if(ans[0]==0) f=false;
		if(f) {
			for(int i=0;i<N;i++) {
				System.out.print(ans[i]);
			}
		}
		else {
			System.out.println(-1);
		}
	}
}