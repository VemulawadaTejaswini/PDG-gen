public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next().replaceAll("1", "a").replaceAll("9", "1").replaceAll("a", "9");
		System.out.println(a);
	}
}
