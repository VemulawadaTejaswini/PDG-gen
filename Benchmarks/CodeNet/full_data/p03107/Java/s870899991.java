import java.util.Scanner;
public class Main{
	
	public static void main(String[]args){
	Scanner scan=new Scanner(System.in);
		String a=scan.next();
		int count=0;
		int c=0;
		for(int i=0;i<a.length()-1;i++) {
			String str=a.substring(i,i+2);
			if(str.equals("01")||str.equals("10")) {
				count+=2;
				a=a.substring(0,i)+a.substring(i+2,a.length());
				c=1;
				if(i!=0) {
					i-=2;
				}
			}
		}
		System.out.println(count);
	}
}