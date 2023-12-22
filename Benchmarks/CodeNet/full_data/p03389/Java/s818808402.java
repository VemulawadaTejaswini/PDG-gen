import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int a[]=new int[4];

	a[0]=-9;
	a[1]=sc.nextInt();
	a[2]=sc.nextInt();
	a[3]=sc.nextInt();

	Arrays.sort(a);

	int ans=0;
	ans=a[3]-a[2];
	a[2]+=ans;
	a[1]+=ans;
if((a[3]-a[1])%2==0){
	ans+=(a[3]-a[1])/2;
}else{
	ans+=1+(a[3]-a[1]+1)/2;
}
System.out.println(ans);
	}}