public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(3 - s.replaceAll("1","").length());
	}
}
