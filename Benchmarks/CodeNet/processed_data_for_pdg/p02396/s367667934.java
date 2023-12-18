public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int value;
		int i = 1;
		while((value = scan.nextInt()) != 0){
			System.out.println("Case " + i + ": " + value);
			i++;
		}
		scan.close();
	}
}
