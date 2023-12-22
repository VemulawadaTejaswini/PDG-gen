import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int q = s.nextInt();
        for (int i = 0; i < q; i++) {
            int t = s.nextInt();
            
            if (t == 1) {
                String strRev = "";
                for (int j = str.length() - 1; j >= 0; j--) {
                    strRev = strRev + str.charAt(j);
                }
                str = strRev;
            }
            
            if (t == 2) {
                int f = s.nextInt();
                String c = s.next();
                if (f == 1) str = c.concat(str);
                if (f == 2) str = str.concat(c);
            }
        }
        System.out.println(str);
	}
}