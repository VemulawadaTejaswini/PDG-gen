import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int count = 0;
		boolean flag = false;
		StringBuilder s = new StringBuilder(in.nextLine());
		int q = in.nextInt();
//		System.out.println("Q: "+q);
		for(int i=0; i<q; i++) {
			int op = in.nextInt();
//			System.out.println("op: "+op);
			if(op==1) {
				//s.reverse();
				count++;
				flag = !flag;
			}else if(op==2) {
				int position = in.nextInt();
//				System.out.println("position: "+position);
				char c = in.next().charAt(0);
//				System.out.println("c: "+c);
				if(flag) {
					if(position==1) position=2;
					else if(position==2) position=1;
				}
				if(position==1) {
					s.insert(0, c);
				}else if(position==2) {
					s.append(c);
				}
			}
		}
		if(count%2!=0) s.reverse();
		System.out.print(s);
		}
	
}
