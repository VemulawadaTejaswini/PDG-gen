import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		long k=sc.nextLong();
		long[] ranran=new long[100];
		char[] ctr=str.toCharArray();
		
		int j=0;
		try {
			while(ctr[j]=='1') {
				j++;
			}
		} catch (Exception e) {
			j--;
		}
		
		if(j>=k)System.out.println(1);
		else System.out.println(String.valueOf(ctr[j]));
	}
}
