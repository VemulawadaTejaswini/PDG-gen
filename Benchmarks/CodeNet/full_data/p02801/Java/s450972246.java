
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		byte[] asciiCodes;
		try {
            asciiCodes = n.getBytes("US-ASCII");
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
		
		asciiCodes[0]+=1;
		String resultString;
		try {
            resultString = new String(asciiCodes, "US-ASCII");
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
		System.out.println(resultString);
		
		
	}
}
