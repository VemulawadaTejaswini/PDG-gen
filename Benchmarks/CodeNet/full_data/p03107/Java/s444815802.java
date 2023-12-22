import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String S=sc.next();
		LinkedList <Integer> n=new LinkedList<Integer>();
		for(int i=0;i<S.length();i++) {
			n.add((int)S.charAt(i));
		}
		int c=0;
		for(int i=1;i<n.size();i++) {
			if(i>0) {
			if(n.get(i)!=n.get(i-1)) {
				c+=2;
				n.remove(i);
				n.remove(i-1);
              	i-=2;
			}}
		}
		System.out.println(c);
	}
}