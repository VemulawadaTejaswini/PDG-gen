import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	long n=sc.nextLong();

	//n=xm+x=x(m+1)
	//1を足すとnの約数になる数字を出す
	//nの約数を列挙して合計して約数の個数を引く
long ans=0;
long kosu=0;
	for(long i=n/4+1;i<=n/2;i++){
if(n%i==0){
	ans+=i;
	kosu++;
	System.out.println(i-1);
}
	}
	System.out.println(n-1);
	ans+=n;
	kosu++;
	System.out.println(ans-kosu);
	}}