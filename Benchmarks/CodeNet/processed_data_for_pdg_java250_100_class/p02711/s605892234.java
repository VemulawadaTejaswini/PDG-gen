public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] str = sc.next().toCharArray();
		if(str[0] == '7' || str[1] == '7' || str[2] == '7') {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
