import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int query = sc.nextInt();
		int[] a = new int[query];
		int acount = 1;
		long bSum = 0;
		StringBuilder sb = new StringBuilder();
		sc.next();
		a[0] = sc.nextInt();
		bSum += sc.nextInt();
		for(int i=1;i<query;i++) {
			int order = sc.nextInt();
			if(order == 1) {
				int addA = sc.nextInt();
				bSum += sc.nextInt();
				int j;
				for(j=acount;j>0;j--) {
					if(addA < a[j-1])
						a[j] = a[j-1];
					else {
						a[j] = addA;
						break;
					}
				}
				if(j==0)
					a[0] = addA;
				acount++;
			}else {
				long atotal = 0;
				for(int j=0;j<(acount-1)/2;j++)
					atotal -= a[j];
				for(int j=(acount-1)/2+1;j<acount;j++)
					atotal += a[j];
				atotal -= acount%2 == 0? a[(acount-1)/2]:0;
				sb.append(a[(acount-1)/2]).append(' ').append(atotal+bSum).append('\n');
			}
		}
		sc.close();
		System.out.println(sb.toString());
	}