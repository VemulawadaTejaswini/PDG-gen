import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	long n=sc.nextLong();

	//n=xm+x=x(m+1)	m>x
	//1を足すとnの約数になる数字を出す
	//nの約数を列挙して合計して約数の個数を引く
	//x...xの時、x^2+2x以上
	long ans=0;
long kosu=0;
	for(long i=1;i<=Math.floor(Math.sqrt(n));i++){
if(n%i==0){
	ans+=(n/i);
	kosu++;
	//System.out.println((n/i)+"\t"+n/i);
}
	}
System.out.println(ans-kosu);
	}}