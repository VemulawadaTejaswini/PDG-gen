public class Main{
	public static void main(String[] args){
		int a,b;
		int tap = 1;
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		while(tap < b){
			tap += (a - 1);
			++ans;
		}
		out.println(ans);
	}
}
