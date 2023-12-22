import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean t1, t2= false, t3= false;
		String n1 = scn.next();
		String n2 = scn.next();
		String n3 = scn.next();
		t1 = true;
		while (true) {
			if(t1) {
				if(n1.isEmpty()) {
					System.out.println("A");
					break;
				}
				if(n1.charAt(0)=='b') {
					t1 = false;
					t2 = true;
				} else if(n1.charAt(0)=='c') {
					t1 = false;
					t3 = true;
				}
				n1 = n1.substring(1);
			}else if(t2) {
				if(n2.isEmpty()) {
					System.out.println("B");
					break;
				}
				if(n2.charAt(0)=='a') {
					t2 = false;
					t1 = true;
				} else if(n2.charAt(0)=='c') {
					t2 = false;
					t3 = true;
				}
				n2 = n2.substring(1);
			}else if(t3) {
				if(n3.isEmpty()) {
					System.out.println("C");
					break;
				}
				if(n3.charAt(0)=='b') {
					t3 = false;
					t2 = true;
				} else if(n3.charAt(0)=='a') {
					t3 = false;
					t1 = true;
				}
				n3 = n3.substring(1);
			}
		}
		scn.close();
	}
}