public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s= br.readLine().split(" ");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		if(a==b){
			System.out.println("a == b");
		}else if(a > b){
			System.out.println("a > b");
		}else{
			System.out.println("a < b");
		}
	}
}
