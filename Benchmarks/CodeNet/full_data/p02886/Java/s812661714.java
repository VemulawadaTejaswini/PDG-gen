import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
int d[]=new int[n];
int sum=0;
for(int i=0;i<n;i++){
	d[i]=sc.nextInt();
sum+=d[i];
}
int ans=0;
for(int i=0;i<n;i++){
	ans+=d[i]*(sum-d[i]);
}
System.out.println(ans/2);

	}
}