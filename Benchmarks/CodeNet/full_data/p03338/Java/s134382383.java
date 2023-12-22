public static void main(String[] args) throws IOException {
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		String num = new String(br1.readLine());
		String text = new String(br2.readLine());
		System.out.println(cutAndCount(num, text));
	}

	public static int cutAndCount(String s1, String s2) {
		int num = Integer.parseInt(s1);
		int count = 0;
		for (int i = 1; i < num; i++) {
			char[] charLeft = s2.substring(0, i).toCharArray();
			char[] charRight = s2.substring(i).toCharArray();
			HashSet<Character> setLeft = new HashSet<>();
			HashSet<Character> setRight = new HashSet<>();
			for (char c : charLeft) {
				setLeft.add(c);
			}
			for (char c : charRight) {
				setRight.add(c);
			}
			setLeft.retainAll(setRight);
			if(setLeft.size() > count) count = setLeft.size();
		}
		return count;
	}