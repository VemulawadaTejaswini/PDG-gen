public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String input = br.readLine();
			if(input.equals("-")){
				break;
			}
			int m = Integer.parseInt(br.readLine());
			for(int i = 0; i < m ; i++){
				StringBuffer sb = new StringBuffer();
				int h = Integer.parseInt(br.readLine());
				sb.append(input.substring(h, input.length()));
				sb.append(input.substring(0, h));
				input = sb.toString();
			}
			System.out.println(input);
		}
	}
}
