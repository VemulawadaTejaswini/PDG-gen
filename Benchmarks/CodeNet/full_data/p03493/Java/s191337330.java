import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String a=scan.next();
		int count=0;
if(a.charAt(0)==1) {
			count++;
		}if(a.charAt(1)==1) {
			count++;
		}if(a.charAt(2)==1) {
			count++;
		}
		System.out.println(count);
	}
}