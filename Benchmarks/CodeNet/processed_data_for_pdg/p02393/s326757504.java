public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int a=Integer.parseInt(st.nextToken());
		int b=Integer.parseInt(st.nextToken());
		int c=Integer.parseInt(st.nextToken());
		int d=0;
		if(a>b) {
			d=a;
			a=b;
			b=d;
		}
		if(b>c) {
			d=b;
			b=c;
			c=d;
		}
		if(a>b) {
			d=a;
			a=b;
			b=d;
		}
		System.out.println(a+" "+b+" "+c);
	}
}
