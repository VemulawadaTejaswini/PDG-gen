import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
	int x[]=new int[n];
	int a2=0;
for(int i=0;i<n;i++){
	x[i]=sc.nextInt();
a2+=2*x[i]*Math.pow(-1, i);
}
a2=a2/2;
for(int i=0;i<n;i++){
System.out.print(a2);

a2=2*(x[i]-a2/2);
if(i!=n-1){
	System.out.print(" ");
}
}
	}}