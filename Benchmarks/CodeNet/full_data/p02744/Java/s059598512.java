import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		if(n==1) System.out.println("a");
		else generate(n);
	}

	static void generate(int n) {
		Queue<String> old_q = new ArrayDeque<String>();
		Queue<String> new_q = new ArrayDeque<String>();
		old_q.add("a");
		for(int i=2;i<=n;i++) {
			while(!old_q.isEmpty()) {
				String temp = old_q.poll();
				if(temp.matches("a*")) {
					new_q.add(temp+"a");
					new_q.add(temp+"b");
				}else {
					for(int j=1;j<i;j++) new_q.add(temp+(char)(96+j));
					if(old_q.isEmpty()) new_q.add(temp+(char)(96+i));
				}
			}
			while(!new_q.isEmpty()) old_q.add(new_q.poll());
		}
		int size=old_q.size();
		for(int i=0;i<size;i++) System.out.println(old_q.poll());
	}
}