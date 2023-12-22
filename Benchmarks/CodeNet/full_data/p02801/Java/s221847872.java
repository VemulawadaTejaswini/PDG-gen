import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String C = sc.nextLine();
		byte[] ch = C.getBytes();
		ch[0] = (byte) (ch[0] + 1);
		String ans = new String(ch);
		System.out.println(ans);
		sc.close();
	}
	
}