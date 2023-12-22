import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char []s = sc.next().toCharArray();
		long k = sc.nextLong();
		
		int count = 0 ;
		
		for(int i = 0; i<s.length; i++) {
			if(s[i] == '1') {
				count++;
			}
			else {
				break;
			}
		}
		if(k > count)
			System.out.println(s[count]);
		if(k <= count)
			System.out.println(1);
		
	}
	

}
