import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		int n=sn.nextInt();
		int a[]=new int[n];
		int b=0;
		for(int i=0;i<n;i++)
			a[i]=sn.nextInt();
		for(int i=0;i<n-1;i++){
			for(int j=n-1;j>i;j--){
				if(a[i]*a[j]%4==0){
					b=a[i+1];
					a[i+1]=a[j];
					a[j]=b;
					break;
				}
			}
		}
		boolean flg=true;
		for(int i=0;i<n-1;i++){
			if(a[i]*a[i+1]%4!=0){
				flg=false;
				break;
			}

		}
		if(flg)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}