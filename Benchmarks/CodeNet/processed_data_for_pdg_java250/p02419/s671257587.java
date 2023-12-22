public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		int count = 0;
		while(true){
			String sentence = br.readLine();
			if(sentence.equals("END_OF_TEXT")){
				break;
			}
			String[] tmpArray = sentence.split("[[^a-z]&&[^A-Z]]");
			for(int i = 0; i < tmpArray.length ; i++){
				if(tmpArray[i].equalsIgnoreCase(word)){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
