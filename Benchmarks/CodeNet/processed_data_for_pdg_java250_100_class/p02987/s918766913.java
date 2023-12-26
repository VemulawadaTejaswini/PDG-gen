public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		char[] a = s.toCharArray();
		String ans;
		if(!(a[0] == a[1] && a[0] == a[2] && a[0] == a[3]) && ((a[0] == a[2] && a[1] == a[3]) || (a[0] == a[3] && a[1] == a[2]) || (a[0] == a[1] && a[2] == a[3])))
ans = "Yes";
else
	ans = "No";
		System.out.println(ans);
	}
}
