public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String result = "Good";
		for(int i = 1; i < s.length(); i++){
		    if(s.charAt(i) == s.charAt(i-1)) result = "Bad";
		}
		System.out.println(result);
	}
}
