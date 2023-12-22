import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		long ans = 0;

		int n = str.length() -1;
      
		for (int i=0; i<(Math.pow(2,n)); i++) {
			String str_first = String.valueOf(str.charAt(0));
			StringBuilder sb = new StringBuilder(str_first);
          
			for (int j=0; j<n; j++) {
				if ((1&i>>j) == 1) {
					sb.append("+");
                }
				sb.append(str.charAt(j + 1));
            }
			String[] subset = sb.toString().split("\\+");
			for (String s : subset) {
				ans += Long.parseLong(s);
            }
        }
		System.out.println(ans);
    }
}
