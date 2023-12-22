import java.util.Scanner;
import java.util.regex.Pattern;
public class Main {
	public static boolean hantei(String str) {
        return Pattern.matches("^[A-Z]+$", str);
    }
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		String a;
		String[] b;
		do {
			n = stdIn.nextInt();
			a = stdIn.next();
			b = a.split("",0);
		}while(n<3||n>50||n != a.length()||hantei(a)==false);
		int c=0;
		
			
		for(int i=0 ; i<b.length-2 ;i++) {
			if(b[i].equals("A")&&b[i+1].equals("B")&&b[i+2].equals("C")) {
			c++;
			}
		}
		System.out.println(c);
	}
	
	}
