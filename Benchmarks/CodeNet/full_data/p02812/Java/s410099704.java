import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next(); 
		String[] sp = S.split("");
		int count = 0;
		for(int i = 0; i < sp.length-2; i++) {
		    if(sp[i].equals("A")) {
		        if(sp[i+1].equals("B")) {
                    if(sp[i+2].equals("C")) {
                        i+=2;
                        count++;
                    }else {
                        i++;
                    }
		        }
		    }
		}
		
		System.out.println(count);
	}
}
