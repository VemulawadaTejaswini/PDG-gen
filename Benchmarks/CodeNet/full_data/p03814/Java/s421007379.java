import java.util.Scanner;

public class Main{
	
	static final Scanner s=new Scanner(System.in);
	
	public static void main(String[] __){
		int a=1145141919,z=-1145141919;
		String in=s.next();
		for(int i=0;i<in.length();i++) {
			switch(in.charAt(i)){
			case 'A':
				a=Math.min(a,i);
				break;
			case 'Z':
				z=Math.max(z,i);
				break;
			}
		}
		System.out.println(z-a+1);
	}
}