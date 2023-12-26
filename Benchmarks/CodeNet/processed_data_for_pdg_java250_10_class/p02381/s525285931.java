public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer b = new StringBuffer();
		double t = 0;
		double m,p;
		double o = 0;
		while (true){
			int n = Integer.parseInt(sc.readLine());
			if(n==0)
				break;
			String[] st = sc.readLine().split(" ");
			int[] z = new int[st.length];
			for(int i = 0;i < st.length;i++){
				z[i] = Integer.parseInt(st[i]);
			}
			for(int i:z)
				t += i;
			m = t/n;
			for(int i:z)
				o += Math.pow(i - m,2);
			o /= n;
			p = Math.sqrt(o);
			b.append(String.format("%.8f",p)+"\n");
			t = 0;
			o = 0;
		}
		System.out.println(b);
	}
}
