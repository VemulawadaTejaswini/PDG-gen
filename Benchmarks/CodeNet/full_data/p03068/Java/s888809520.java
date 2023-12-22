import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int k = sc.nextInt();
		char a= s.charAt(k-1);
		StringBuilder aa = new StringBuilder();
		aa.append(s);
		sc.close();
	for(int i =0; i<n; i++) {
    if(s.charAt(i)!=a)
    	aa.setCharAt(i, '*');
	}
	String ans = aa.toString();

	System.out.println(ans);

	}

}
