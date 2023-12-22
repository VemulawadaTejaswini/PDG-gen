import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		StringBuilder s = new StringBuilder().append(sc.nextLine());

		System.out.println(remove(s,0));
	}

	public static int remove(StringBuilder s,int ans) {

		boolean flag = false;
		StringBuilder s2 = s;

		for(int i=0;i<s2.length()-1;i++) {

			if(s2.substring(i, i+2).equals("01") ||
			   s2.substring(i, i+2).equals("10")) {
				s2 = s2.delete(i, i+2);
				flag = true;
				ans += 2;
			}
		}

		if(flag) {
			return remove(s2,ans);
		}else {
			return ans;
		}
	}

}
