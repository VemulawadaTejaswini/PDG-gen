
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		String N = in.nextLine();
		long K = in.nextLong();
		
		int index=0;
		String s = "";
		for(int j=0; j<N.length(); j++) {
			if(!N.substring(j,j+1).equals("1")) {
				s = N.substring(j,j+1);
				index = j+1;
				break;
			}
		}
		if(K < index) {
			System.out.println(1);
		}else {
			System.out.println(s);
		}
	
		in.close();
	}
}