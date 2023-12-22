public class Main{
	public static void main(String[] args) {
		int sum = 0;
		StringBuilder out = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String words = sc.next();
			if(words.equals("0"))
			break;
			char ch[] = words.toCharArray();
			sum = 0;
			for (int i = 0; i < ch.length; i++) {
				String str = String.valueOf(ch[i]);
				int num = Integer.parseInt(str);
				sum += num;
			}
			out = new StringBuilder(out+(sum+"\n"));
		}
		System.out.print(out);
	}
}
