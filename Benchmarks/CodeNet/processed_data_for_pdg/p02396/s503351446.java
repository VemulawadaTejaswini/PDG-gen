public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result = "";
		for (int i = 0; i < 10000; i++) {
			String line = sc.nextLine();
			 result = line;
			 if (line.equals("0")){
				 break;
			 }
			 System.out.println("Case " + (i + 1) + ": " + line);
		}
	}
}
