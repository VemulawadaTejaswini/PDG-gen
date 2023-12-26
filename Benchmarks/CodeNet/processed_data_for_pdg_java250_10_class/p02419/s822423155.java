public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String key = br.readLine();
		int count=0;
		String line=br.readLine();
		String[] words = line.split(" ",0);
		while(!line.equals("END_OF_TEXT")){
			for(int i=0;i<words.length;i++){
				if(key.equalsIgnoreCase(words[i])){
					count++;
				}
			}
			line=br.readLine();
			words = line.split(" ");
		}
		System.out.println(count);
	}
}
