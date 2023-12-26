public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int count = 0;
		for(char x: input.toCharArray()){
			if(x == '1'){
				count++;
			}
		}
		System.out.println(count);
	}
}
