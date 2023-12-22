import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int[] N = new int[n.length()+1];
		int x=0;
		for(int i=0;i<n.length();i++) {
			x=x+Integer.parseInt(n.substring(i, i+1));
		}
		if(Integer.parseInt(n)%x == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}