import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.next();
		long result = Long.parseLong(s);
		int pattern = (int) Math.pow(2, s.length()-1);
		for (int j=1;j<pattern;j++) {
			result +=Main.sum(s, j);
		}
		System.out.println(result);
	}

	public static long sum (String s,int i) {
		if (s.length()==1) {
			return Long.parseLong(s);
		}
		int a[] = new int[s.length()-1];
		for (int j=0;j<s.length()-1;j++) {
			a[j] = i%2;
			i=i/2;
		}
		long sum =0;
		long temp =s.charAt(0)-'0';
		for (int j=0;j<s.length()-1;j++) {
			if (a[j]==1) {
				sum +=temp;
				temp=s.charAt(j+1)-'0';
			} else {
				temp = temp *10+s.charAt(j+1)-'0';
			}
		}
		sum +=temp;
		return sum;
	}
}