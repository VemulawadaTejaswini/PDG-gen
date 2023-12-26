public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String segment = br.readLine();
		StringBuffer[] sbArray = new StringBuffer[input.length()];
		for(int i = 0; i < input.length() ; i++){
			sbArray[i] = new StringBuffer();
			for(int j = 0 ; j < segment.length() ; j++){
				sbArray[i].append(input.charAt((i+j)%input.length()));
			}
			if(sbArray[i].toString().equals(segment)){
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
