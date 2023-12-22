import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		int n=stdin.nextInt();
		int flag=n%2;
		int a[]=new int[n];
		int alice=0;
		int bob=0;
		int max=0;
		int i=0,j=0;
		int h=0;
		int index=0;
		for( i=0;i<n;i++){
			a[i]=stdin.nextInt();
		}
		for(h=0;h<n/2+flag;h++){
			for(i=0;i<n;i++){
				if(max<a[i]){
					max=a[i];
					index=i;
				}
			}
			alice=alice+max;
			a[index]=0;
			max=0;
			for(j=0;j<n;j++){
				if(max<a[j]){
					max=a[j];
					index=j;
				}
			}
			bob=bob+max;
			a[index]=0;
			max=0;
		}
		System.out.println(alice-bob);
	}
}

