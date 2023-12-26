public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine(); 
		sc.close(); 
		String s2 = s.replace("0", ""); 
		System.out.println(s2.length());
	}
}
