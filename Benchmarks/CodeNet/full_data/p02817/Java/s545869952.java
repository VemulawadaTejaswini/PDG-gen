	void main() {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String str2 = scanner.nextLine();
		
		Pattern pattern = Pattern.compile("^[a-z]+$");
		
		boolean isClear = Stream.of(str, str2).allMatch(s -> pattern.matcher(s).find() && s.length() >= 1 && s.length() <= 100);
		if (isClear) {
			System.out.println(str2 + str);
		}
	}