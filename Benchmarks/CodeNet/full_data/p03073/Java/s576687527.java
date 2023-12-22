import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String OneFirst = "";
		String ZeroFirst = "";
		String S1 = br.readLine();
		
		for(int i =0; i<S1.length(); i++ ) {
			if(i%2 == 0) {
				OneFirst = OneFirst+ "1";	
				ZeroFirst = ZeroFirst + "0";
			}
			else {
				OneFirst =OneFirst + "0";	
				ZeroFirst = ZeroFirst + "1";
			}
			
		}
		int count = 0;
		int count1 = 0;
		for(int i =0; i<S1.length(); i++) {
		
			char a = OneFirst.charAt(i);
			char s = S1.charAt(i);
			char s1 = ZeroFirst.charAt(i);
			StringBuilder Replaced = new StringBuilder(S1);
			
		
			
			if(s !=a ) {
				Replaced.setCharAt(i, a);
				count++;
			}
			if(s1 !=a ) {
				Replaced.setCharAt(i, a);
				count1++;
			}
		}
		
//		int count1 = 0;
//		
//		for(int i =0; i<S1.length(); i++) {
//			char a = ZeroFirst.charAt(i);
//			char s = S1.charAt(i);
//			StringBuilder Replaced = new StringBuilder(S1);
//		
//			
//			if(s !=a ) {
//				Replaced.setCharAt(i, a);
//				count1++;
//			}
//		}
		
		
		if(count1 < count) {
			System.out.println(count1);
		}
		else {
			System.out.println(count);
		}
	}

}
