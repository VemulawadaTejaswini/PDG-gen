public class Main{
	public static void main(String[] args){
		String input;
		StringBuilder output = new StringBuilder();
		int offset = 32;
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();
		for (int i = 0; i < input.length(); i++){
			int temp = input.charAt(i);
			if (65 <= temp && temp <= 90){
				temp += offset;
			}else if (97 <= temp && temp <= 122){
				temp -= offset;
			}
			output.append((char)temp);
		}
		System.out.println(output.toString());
	}
}
