import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		StringBuilder stdout = new StringBuilder();
		String s1 = sc.next();
		String s2 = new StringBuilder(sc.next()).reverse().toString();
		if(s1.equals(s2)){
			stdout.append("YES");
		}else{
			stdout.append("NO");
		}
		System.out.println(stdout);
	}
}
