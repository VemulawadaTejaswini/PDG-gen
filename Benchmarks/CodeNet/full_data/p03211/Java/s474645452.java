public class Main {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int min = Math.abs(Integer.parseInt(input.substring(0,3))-753);
		for(int i = 0; i < input.length() - 2; i++) {
			String temp = input.substring(i, i+3);
			int x = Integer.parseInt(temp);
			int diff = Math.abs(x - 753);
			if(diff<min) {
				min = diff;
			}
		}
		System.out.println(min);
		scan.close();
	}
	
}
