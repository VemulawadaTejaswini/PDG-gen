import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String ans = scan.nextLine();
		String str = scan.nextLine();
		int q = Integer.parseInt(str);
		int invert = 1;
		for (int i = 0; i<q; i++) {
			str = scan.nextLine();
			String[] substr = str.split(" ", 0);
			int a = Integer.parseInt(substr[0]);
			if (a == 1) {
				invert = invert * -1;
			} else {
				StringBuffer buf = new StringBuffer();
				int b = Integer.parseInt(substr[1]);
				if (b == 1) {
					if (invert == 1) {
						buf.append(substr[2] );
						buf.append(ans);
						ans = buf.toString();
					} else {
						buf.append(ans);
						buf.append(substr[2] );
						ans = buf.toString();
					}
				} else {
					if (invert == -1) {
						buf.append(substr[2] );
						buf.append(ans);
						ans = buf.toString();
					} else {
						buf.append(ans);
						buf.append(substr[2] );
						ans = buf.toString();
					}
				}
			}
		}

		if (invert == -1) {
        StringBuffer str2 = new StringBuffer(ans);
        String hoge2 = str2.reverse().toString();
        ans = hoge2;
		}

		scan.close();
		System.out.println(ans);
	}
}
