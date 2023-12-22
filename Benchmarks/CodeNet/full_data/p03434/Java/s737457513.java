import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int n=stdIn.nextInt(),a[]=new int[100],l=0,b=0,i,j,t;
		for(i=0;i<n;i++) a[i]=stdIn.nextInt();
		for(i=0;n-1>i;i++) {
			for(j=n-1;j>i;j--) {
				if(a[j]>a[j-1]) {
					t=a[j];
					a[j]=a[j-1];
					a[j-1]=t;
				}
			}
		}
		for(i=0;i<n;i+=2) l+=a[i];
		for(i=1;i<n;i+=2) b+=a[i];
		System.out.print(l-b);
	}
}