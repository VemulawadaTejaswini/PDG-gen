import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] ans =new int[s.length()];
		int bound = 0;
		boolean flag = true;
		int r = 0;
		int l = 0;

		for(int i = 0; i < s.length(); i++) {
			if(flag  && s.charAt(i) == 'L') {
				bound = i-1;
				ans[bound] += (r%2==0) ? r/2 : (r/2)+1;
				ans[bound+1] += r/2;
				r = 0;
				flag = false;
			}else if(!flag && s.charAt(i) == 'R') {
				ans[bound] += l/2;;
				ans[bound+1] += (l%2==0) ? l/2 : (l/2)+1;
				l = 0;
				flag = true;
			}
			if(flag)r++;
			else 	l++;
		}

		ans[bound] += l/2;;
		ans[bound+1] += (l%2==0) ? l/2 : (l/2)+1;

		for(int i = 0; i < s.length(); i++)
			System.out.printf("%d ",ans[i]);

		sc.close();
	}
}