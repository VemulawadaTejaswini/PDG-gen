import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		int[][] array=new int[m][2];
		for(int i=0;i<m;i++) {
			array[i][0]=sc.nextInt();
			array[i][1]=sc.nextInt();
			if(n!=1 && array[i][0]==1 && array[i][1]==0) {
				System.out.println("-1");
				sc.close();
				return;
			}
		}
		sc.close();
		int init=(int)Math.pow(10, n-1), fin=(int)Math.pow(10, n),flag=0;
		if(n==1) init=0;
		for(int i=init;i<fin;i++) {
			flag=0;
			for(int j=0;j<m;j++) {
				if(digit(n,array[j][0],i)!=array[j][1]) flag=1;
			}
			if(flag==0) {
				System.out.println(i);
				return;
			}
		}
		System.out.println("-1");
	}

	static int digit(int n, int keta,int num) {
		for(int i=1;i<=n-keta;i++) num/=10;
		return num%10;
	}
}