public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str = br.readLine();
	    StringTokenizer st = new StringTokenizer(str, " ");
		int a  = Integer.parseInt(st.nextToken());
		int b  = Integer.parseInt(st.nextToken());
		int c  = Integer.parseInt(st.nextToken());
		if(a <= b && b <= c ) {
			System.out.println(a + " " + b + " " + c);
		}else if(a <= b && c <= b){
			System.out.println(a + " " + c + " " + b);
		}else if(b <= c && c <= a){
			System.out.println(b + " " + c + " " + a);
		}else if(b <= c && a <= c){
			System.out.println(b + " " + a + " " + c);
		}else if(c <= a && a <= b){
			System.out.println(c + " " + a + " " + b);
		}else if(c <= a && b <= a){
			System.out.println(c + " " + b + " " + a);
		}
	}
}
