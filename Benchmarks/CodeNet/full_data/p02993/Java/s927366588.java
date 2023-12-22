import java.util.*;
public class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String S=sc.next();
		sc.close();
		char Scut[]=new char[4];
		boolean signal=false;
		for(int i=0;i<4;i++) {
			Scut[i]=S.charAt(i);
		}
		for(int j=0;j<3;j++) {
			if(Scut[j]==Scut[j+1]) {
				signal=true;
				break;
			}
		}
		if(signal) {
			System.out.println("Bad");
		}else {
			System.out.println("Good");
		}
	}
}