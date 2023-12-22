import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[]s=new int[m];
		int[]p=new int[m];
		int num=0;
		for(int i=0;i<m;i++) {
			int allS=0;
			int k=sc.nextInt();
			for(int j=0;j<k;j++) {
				allS=allS |1<<(sc.nextInt()-1);
			}
			s[i]=allS;
		}
		for (int i=0;i<1<<n;i++) {
			boolean flag = true;
			for(int j=0;j<m;j++) {
				if(i==0)
					p[j]=sc.nextInt();
				int k=s[j]&i;
				if(Integer.bitCount(k)%2!=p[j]) {
					flag=false;
					continue;
					}
			}
			if(flag)
				num++;
		}
			System.out.println(num);
	}
}
