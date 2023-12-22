import java.util.Scanner;

public class Main {
static String p = "";
static String q = "";
static int intp=0;
static int intq=0;
static int count=1;
static String tmp = "";
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0;i<n;i++){
			p += sc.next();
		}
		sc.nextLine();
		for(int i = 0;i<n;i++){
			q += sc.next();
		}
		String nString = "";
		for(int i = 1;i<n+1;i++){
			nString +=i;
		}
		if(p.equals(q)){
			System.out.println("0");
		}else{
			permutation(nString, "");
			System.out.println(Math.abs(intp - intq));
		}
	}

		public static void permutation(String a, String ans){
			// Base Case
			if(a.length() <= 1) {
				count++;
				tmp = ans;
				tmp +=a;
				if(tmp.equals(p)){
					intp = count;
				}else if(tmp.equals(q)){
					intq = count;
				}

			}
			// General Case
			else {
				for (int i = 0; i < a.length(); i++) {
					permutation(a.substring(0, i) + a.substring(i + 1),
							ans + a.charAt(i));
				}
			}
		}
}