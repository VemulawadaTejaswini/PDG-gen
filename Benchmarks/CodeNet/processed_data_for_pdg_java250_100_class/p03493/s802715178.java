public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = 0;
		for(int i = 0; i < s.length(); i++){
			int m = Integer.parseInt(s.substring(i, i+1));
			n = n + m;
		}
		System.out.println(n);
	}
}
