import java.util.HashMap;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		HashMap<String,String> map = new HashMap<String,String>();

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int n = Integer.parseInt(str);

		str = scan.nextLine();
		String[] substr = str.split(" ", 0);
		String ans = "YES";
		for (int i=0; i<n; i++) {
			if (map.containsKey(substr[i])) {
				ans = "NO";
				break;
			}  else {
				map.put(substr[i], "1");
			}
		}

		System.out.println(ans);
	}
}