import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		int[] a=new int[4];
		for(int i=0;i<s.length();i++) {
			if(s.substring(i, i+1).equals("N"))a[0]++;
			if(s.substring(i, i+1).equals("W"))a[1]++;
			if(s.substring(i, i+1).equals("S"))a[2]++;
			if(s.substring(i, i+1).equals("E"))a[3]++;
		}
		if(a[0]>0&&a[1]>0&&a[2]>0&&a[3]>0)System.out.println("Yes");
		else System.out.println("No");
	}
}
