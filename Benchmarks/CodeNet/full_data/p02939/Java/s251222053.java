import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();


		int ans = 0;
		String tmp = S.substring(0,1);
		int index = 1;
		ans++;
		for (int i = 2; i < S.length(); i++) {
			if (! tmp.equals(S.substring(index, i))){
				tmp = S.substring(index,i);
				ans++;
				index=i;
			}
		}

		if(!"".equals(S.substring(index,S.length())) && !tmp.equals(S.substring(index,S.length()))){
			tmp = S.substring(index,S.length());
			ans++;
		}

		System.out.println(ans);
	}
}