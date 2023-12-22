public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] count = new int[26];
		while(true){
			String input = br.readLine();
			if(input == null){
				break;
			}
			for(int i = 0; i < input.length() ; i++){
				char c = input.charAt(i);
				if(Character.isUpperCase(c)){
					c = Character.toLowerCase(c);
				}
				if(Character.isAlphabetic(c)){
					count[c - 'a']++;
				}
			}
		}
		for(int i = 0; i < 26; i++){
			System.out.println((char)('a'+i) + " : " + count[i]);
		}
	}
}
