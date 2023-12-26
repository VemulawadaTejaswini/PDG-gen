class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = "";
		while(sc.hasNext()) {
			sentence += sc.nextLine();
		}
		TreeMap<Character, Integer> countAlph = new TreeMap<>();
		char alphabet = 'a';
		final int ALPHABET_SIZE = 'z' - 'a';
		for(int i=0; i<=ALPHABET_SIZE; i++) {
			countAlph.put(alphabet, 0);
			alphabet++;
		}
		for(int i=0; i<sentence.length(); i++) {
			if(sentence.charAt(i) == ' ') continue;
			String checkChar = String.valueOf(sentence.charAt(i));
			if(Character.isUpperCase(checkChar.charAt(0))) checkChar = checkChar.toLowerCase();
			Pattern p = Pattern.compile("[a-z]");
			Matcher m = p.matcher(checkChar);
			if(m.find()) countAlph.put(checkChar.toCharArray()[0], countAlph.get(checkChar.toCharArray()[0]) + 1);
		}
		alphabet = 'a';
		for(int i=0; i<=ALPHABET_SIZE; i++) {
			System.out.println(String.valueOf(alphabet) + " : " + countAlph.get(alphabet));
			alphabet++;
		}
		sc.close();
	}
}
