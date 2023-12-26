public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int W = Integer.parseInt(s[0]);
		int H = Integer.parseInt(s[1]);
		int x = Integer.parseInt(s[2]);
		int y = Integer.parseInt(s[3]);
		int r = Integer.parseInt(s[4]);
		if(x >= r && y >= r && W-x >= r && H-y >= r){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
