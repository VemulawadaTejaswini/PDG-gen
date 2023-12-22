import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		int[] a=new int[2];
		for(int i=0;i<3;i++) {
			if(s.substring(i, i+1).equals("A"))a[0]++;
			if(s.substring(i, i+1).equals("B"))a[1]++;
		}
		if(a[0]!=0&&a[1]!=0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}