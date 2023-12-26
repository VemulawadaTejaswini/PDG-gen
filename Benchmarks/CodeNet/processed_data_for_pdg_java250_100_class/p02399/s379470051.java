public class Main {
	public static void main(String[] args){
		String str = null;
		BufferedReader br = null;
		br = new BufferedReader(new InputStreamReader(System.in));
		String[] str1;
		int a,b,c,d,r;
		double f;
		try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		str1 = str.split(" ");
		a = Integer.parseInt(str1[0]);
		b = Integer.parseInt(str1[1]);
		d=a/b;
		r=a%b;
		f=(double)a/b;
		System.out.printf("%d %d %.5f",d,r,f);
		}
}
