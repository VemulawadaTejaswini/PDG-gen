public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = null;
		int count = 0;
		try {
			word = br.readLine();
			while(true) {
				String sentence = br.readLine();
				if ("END_OF_TEXT".equals(sentence)) {
					break;
				}
				String[] tmpArr = sentence.split("\\s");
				for (int i = 0; i < tmpArr.length; i++) {
					if (tmpArr[i].equalsIgnoreCase(word)) {
						count++;
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(count);
	}
}
