import java.util.Scanner;

public class Main
{
    
    private static String reverse(String str) {
        String strRev = "";
            for (int j = str.length() - 1; j >= 0; j--) {
                strRev = strRev + str.charAt(j);
            }
            return strRev;
    }
    
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int q = s.nextInt();
        for (int i = 0; i < q; i++) {
            int t = s.nextInt();
            if (t == 1) {str = reverse(str);} 
            else if (t == 2) {
                int f = s.nextInt();
                String c = s.next();
                if (f == 1) {str = c.concat(str);}
                else if (f == 2) str = str.concat(c);
            }
        }
        System.out.println(str);
	}
}