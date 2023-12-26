public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int x;
		String[] num = str.split(" ", 0);
		int a = Integer.parseInt(num[0]); 
		int b = Integer.parseInt(num[1]); 
		int c = Integer.parseInt(num[2]); 
		if (a > b) {
			x = a;
			a = b;
			b = x;
		}
		if (b > c){
			x = b;
			b = c;
			c = x;
		}		
		if (a > b) {
			x = a;
			a = b;
			b = x;
		}
		System.out.println(a + " " + b + " " + c);
        }
}
