import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),res=n*2;
		String s=sc.next(),t=sc.next();
		
		for(int i=0;i<n;i++) {
			if(s.substring(i, n).equals(t.substring(0, n-i))) res-=n-i;
		}
		System.out.println(res);
	}
}
