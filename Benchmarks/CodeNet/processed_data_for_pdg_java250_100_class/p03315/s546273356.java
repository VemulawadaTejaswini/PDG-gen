public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int ans = 0;
		for(int i=0;i<W.length();i++){
			if('+' == W.charAt(i)){
				ans++;
			}else{
				ans--;
			}
		}
		System.out.println(ans);
	}
}
