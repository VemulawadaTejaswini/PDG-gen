import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x=0;
		int x1=0;
		String str = sc.next();
		for(int i=0;i<n;i++) {
			if(str.charAt(i)=='I') {
				x++;
			}else if(str.charAt(i)=='D') {
				x--;
			}
			if(x1<x) {
				x1=x;
			}
		}
		System.out.println(x1);
	}

}
