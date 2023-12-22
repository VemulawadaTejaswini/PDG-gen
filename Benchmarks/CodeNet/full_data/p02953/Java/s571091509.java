import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int before= sc.nextInt();
		boolean change = true;
		int h = 0;
		for(int i = 1;i < n;i++) {
			h= sc.nextInt();
			//System.out.print("h : " + h);
			//System.out.print(", b : " + before);
			//System.out.print(", c : " + change + " ...");
			
			if(before - h > 2 ) {
				System.out.println("No");
				System.exit(0);
			}else {
				if(before > h) {
					if(change == true) {
						change = false;
					}else {
						System.out.println("No");
						System.exit(0);
					}
				}else {
					if(before == h)change = false;
					else change = true;
				}
			}
			before = h;
			//System.out.println("Yes");
		}
		System.out.println("Yes");

	}

}
