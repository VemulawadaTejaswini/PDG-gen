import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a;
		a = sc.next();
		boolean r = true;
		
		char b[] = a.toCharArray();
		
		for(int i=0 ; i<a.length()-1 ; i++) {
		    for(int j=i+1 ; j<a.length() ; j++) {
		        if(b[i] == b[j]) {
		            r = false;
		            if(r == false) break;
		        }
		        else {
		            r = true;
		        }
		    }
		    if(r == false) break;
		}
		
		if(r == true) {
		    System.out.println("yes");
		}
		else {
		    System.out.println("no");
		}
	}
}