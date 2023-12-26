public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] lines = line.split("");
		boolean flag = true;
		int before = Integer.parseInt(lines[0]);
		for(int i = 1 ; i < lines.length ; i++) {
			int after = Integer.parseInt(lines[i]);
			if(before == after) {
				flag = false;
				break;
			}
			before = after;
		}
		if(flag) {
			System.out.println("Good");
		}else {
			System.out.println("Bad");
		}
	}
}
