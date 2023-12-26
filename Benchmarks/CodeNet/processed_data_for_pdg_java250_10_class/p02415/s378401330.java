public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		for(int i = 0; i < input.length() ; i++){
			char c = input.charAt(i);
			if(Character.isLowerCase(c)){
				System.out.print(Character.toUpperCase(c));
			}
			else if(Character.isUpperCase(c)){
				System.out.print(Character.toLowerCase(c));
			}
			else {
				System.out.print(c);
			}
		}
		System.out.println();
	}
}
