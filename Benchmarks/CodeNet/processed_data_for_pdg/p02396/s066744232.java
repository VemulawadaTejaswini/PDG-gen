public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int inNum = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);	
		do {
			inNum = sc.nextInt();
			if (inNum < 0 || inNum > 10000) {
				System.err.println("Err!");
				return;
			}
			list.add(new Integer(inNum));
			count++;
		 } while (inNum != 0 || count == 10000);
		 for (int i = 1; i < list.size(); i++) {
		 	System.out.printf("Case " + i + ": " + list.get(i-1) + "%n");
		 }
	}
}
