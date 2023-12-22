public class Main {

	public static void main(String[] args) {
		String input_str = new java.util.Scanner(System.in).nextLine();
		// テスト用
		//String input_str = args[0];

		String[] str = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
		for(int i = 0; i < 8; i++) {
			if(input_str.equals(str[i])){
				System.out.println(i + 1);
			}
		}
	}

}