public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String input = br.readLine();
			if(input.equals("0")){
				break;
			}
			int sum = 0;
			for(int i = input.length() - 1; i >= 0 ; i--){
				sum += input.charAt(i) - '0';
			}
			System.out.println(sum);
		}
	}
}
