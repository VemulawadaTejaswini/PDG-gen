public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String result = "Heisei";
		if(s.compareTo("2019/04/30") > 0) result = "TBD";
		System.out.println(result);
	}
}
