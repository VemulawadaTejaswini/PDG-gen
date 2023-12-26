public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x=br.readLine();
		while(!x.equals("0")) {
			int n=x.length();
			int sum=0;
			for(int i=0;i<n;i++) {
				char a;
				a=x.charAt(i);
				int b=Integer.parseInt(String.valueOf(a));
				sum+=+b;
			}
			System.out.println(sum);
			x=br.readLine();
		}
	}
}
