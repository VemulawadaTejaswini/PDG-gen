import java.util.*;


public class Main {

	public static void main(String[] args) {
		
		int t = 0;
		
		String S = new java.util.Scanner(System.in).nextLine();
		String[] ar = S.split("");
		String[] vr = new String[2];
		vr[0] = "+";
		vr[1] = "-";
 		for(int i=0;i<4;i++) {
			if(ar[i].equals(vr[0])) {
				t++;
			}
			else {
				t--;
			}
		}
		System.out.println(t);
	}

}
