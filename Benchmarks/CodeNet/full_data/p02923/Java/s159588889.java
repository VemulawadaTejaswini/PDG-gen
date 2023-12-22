import java.util.Scanner;

public class Main {
	public static void main(String args[]) {	
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		
		int now=Integer.parseInt(sc.next());
		int maxcount=0;
		int count=0;
		for(int i=0;i<a-1;i++) {
			int b = Integer.parseInt(sc.next());
			if(now<b) {
				if(maxcount < count)maxcount= count;
				count =0;
			}else {
				count++;
			}
			now=b;
			
		}
		
		if(maxcount < count)maxcount= count;
		count =0;
		System.out.println(maxcount);
	}
}
