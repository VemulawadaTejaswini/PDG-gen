import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		int[] arrayb=new int[m];
		int[] arraya=new int[m];
		for(int i=0;i<m;i++) {
			arrayb[i]=sc.nextInt();
		}
		int count=0,count1=0;
		for(int j=0;j<n;j++) {
			for(int i=0;i<m;i++) {
				count+=sc.nextInt()*arrayb[i];
			}
			count+=c;
			if(count>0) {
				count1++;
			}
			count=0;
		}
		System.out.println(count1);
	}
}

//Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));


