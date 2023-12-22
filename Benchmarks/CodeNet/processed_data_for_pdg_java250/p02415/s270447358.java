public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int n=str.length();
		for(int i=0;i<n;i++) {
			char a;
			a=str.charAt(i);
			if(Character.isUpperCase(a)) {
				String c=String.valueOf(a);
				c=c.toLowerCase();
				System.out.print(c);
			}else {
				String c=String.valueOf(a);
				c=c.toUpperCase();
				System.out.print(c);
			}
		}
		System.out.println();
	}
}
