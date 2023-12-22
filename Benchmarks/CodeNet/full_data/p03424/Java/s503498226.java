import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag=false;
		String arare[] = new String[n];
		for(int i=0 ; i<n ; i++) {
			arare[i] = sc.next();
		}
		for(int k=0 ; k<arare.length ; k++) {
			if(arare[k].equals("Y")) {
				flag=true;
			}
		}
		if(flag) {
			System.out.println("Four");
		}else {
			System.out.println("Three");
		}
	}

}
