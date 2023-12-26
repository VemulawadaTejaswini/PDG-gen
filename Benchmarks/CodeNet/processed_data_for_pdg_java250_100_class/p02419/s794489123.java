public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			String word = in.readLine();
			int count = 0;
			String line = "";
			while ((line = in.readLine()).equals("END_OF_TEXT") == false) {
				String words[] = line.split(" ");
				for (int i = 0; i < words.length; i++) {
					String str = words[i].toLowerCase();
					if (word.equals(str) == true) {
						count++;
					}
				}
			}
			System.out.println(count);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
