import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		byte[] asciiCodes;
		String ans = "";

		try {
            asciiCodes = S.getBytes("US-ASCII");
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
		
		for(int i=0; i<S.length(); i++){
			asciiCodes[i] += N;
			if(asciiCodes[i]>90){
				asciiCodes[i] -= 26;
			}
			//String str = String.valueOf(c);
		}
		try {
            ans = new String(asciiCodes, "US-ASCII");
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
		System.out.println(ans);
    }
}
