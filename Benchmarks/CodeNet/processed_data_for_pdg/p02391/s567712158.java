public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int param1 = sc.nextInt();
		int param2 = sc.nextInt();
		String ret = "";
		if(param1 < param2) {
			ret = "a < b";
		}else if(param1 > param2) {
			ret = "a > b";
		}else {
			ret = "a == b";
		}
		System.out.println(ret);
		sc.close();
	}
}
