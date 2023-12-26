public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while (true){
			ArrayList<Character> list = new ArrayList<Character>();
			String input = sc.next();
			if (input.equals("-") == true){
				break;
			}
			for (int i = 0; i < input.length(); i++){
				list.add(input.charAt(i));
			}
			int m = sc.nextInt();
			for (int i = 0; i < m; i++){
				int h = sc.nextInt();
				ArrayList<Character> subList = new ArrayList<Character>();
				for (int j = 0; j < h; j++){
					char temp = list.get(0);
					list.add(temp);
					list.remove(0);
				}
			}
			for (char c : list){
				System.out.print(c);
			}
			System.out.print("\n");
		}
	}
}
