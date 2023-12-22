import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		int min=Integer.MAX_VALUE;
		for(int i=0;i<s.length()-2;i++) {
			int temp = Integer.parseInt(s.substring(i,i+3));
			if(Math.abs(temp-753)<min)min=Math.abs(temp-753);
		}
		System.out.println(min);
	}

}
