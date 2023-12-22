import java.util.Scanner;
public class Main {
public static void main(String[]args) {
	Scanner t = new Scanner (System.in);
	int num,cont = 0, cont1=0;
	num =t.nextInt();
	String v;
	v=t.next();
	for(int i = 0;i<v.length();i++) {

	if(v.charAt(i)=='R'){
		cont++;
	}
		if(v.charAt(i)=='B') {
			cont1++;
		
	}
	}
		if(cont>cont1) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}