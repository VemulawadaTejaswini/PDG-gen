public class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int[] char_count = new int[26];
		while(in.hasNextLine()){
			String str = in.nextLine();
			if(str.length() == 0){
				break;
			}else{
				String lower_case = str.toLowerCase();
				for (int i = 0; i < lower_case.length(); i++) {
					int array_number = 0;
					for(char a = 'a'; a <= 'z'; a++) {
						if(lower_case.charAt(i) == a){
							char_count[array_number]++;
							break;
						}
						array_number++;
					}
				}
			}
		}
		char a = 'a';
		for(int i = 0; i < 26; i++){
			System.out.println(a++ + " : " + char_count[i]);
		}
	}
}
