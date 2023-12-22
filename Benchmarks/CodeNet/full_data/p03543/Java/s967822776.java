import java.util.*;
import java.lang.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] b=new int[5];
		int c=10;
		int d=0;
		for(int i=0;i<4;i++) {
			b[i]=a%c;
			//System.out.println(b[i]);
			a/=10;
		}
		for(int i=0;i<3;i++) {
			if(b[i]==b[i+1]) {
				if(b[i]==b[i+2])
				d++;
				break;
			}
		}
		if(d>=1)System.out.println("Yes");
		else System.out.println("No");
		//System.out.println(d);
	}
}