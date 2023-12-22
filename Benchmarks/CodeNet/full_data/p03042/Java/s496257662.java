import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader r = new BufferedReader (new InputStreamReader (System.in));
		String s1 = r.readLine();
		
		int c = 0;
		
		if (isMonth(s1.substring(0, 2))) {
			c += 2;
		}
		if (isMonth(s1.substring(2, 4))) {
			c += 1;
		}
		
		if (c == 0) {
			System.out.println("NA");
		}
		if (c == 1) {
			System.out.println("YYMM");
		}
		if (c == 2) {
			System.out.println("MMYY");
		}
		if (c == 3) {
			System.out.println("AMBIGUOUS");
		}
	}
	
	static boolean isMonth(String data) {
		if (data.equals("01")) {
			return true;
		}
		if (data.equals("02")) {
			return true;
		}
		if (data.equals("03")) {
			return true;
		}
		if (data.equals("04")) {
			return true;
		}
		if (data.equals("05")) {
			return true;
		}
		if (data.equals("06")) {
			return true;
		}
		if (data.equals("07")) {
			return true;
		}
		if (data.equals("08")) {
			return true;
		}
		if (data.equals("09")) {
			return true;
		}
		if (data.equals("10")) {
			return true;
		}
		if (data.equals("11")) {
			return true;
		}
		if (data.equals("12")) {
			return true;
		}
		return false;
	}
}