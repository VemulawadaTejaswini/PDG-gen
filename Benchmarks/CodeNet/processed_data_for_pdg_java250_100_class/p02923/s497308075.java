public class Main{
	public static void main(String[] args){
		int n;
		int ans = 0,cnt = 0;
		ArrayList<Integer> h;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		h = new ArrayList<Integer>();
		for (int i = 0; i < n; ++i)	h.add(sc.nextInt());
		for (int i = 0; i + 1 < n; ++i){
			if(h.get(i) >= h.get(i + 1))	++cnt;
			else{
				if(ans < cnt)	ans = cnt;
				cnt = 0;
			}
		}
		if(ans < cnt)	ans = cnt;
		out.println(ans);
	}
}
