public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int sum = 0;
		for(int i = 0;i<4;i++){
			char c = s.charAt(i);
			if(c == '+')sum++;
			else sum--;
		}
		System.out.println(sum);
	}
}
