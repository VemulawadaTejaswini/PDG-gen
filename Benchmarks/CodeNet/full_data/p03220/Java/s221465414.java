import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
double d=0;
int ans=0;
double ans1=1000;
int j=0;
for(int i=0;i!=a;i++) {
d=scan.nextInt();
d=b-(d*0.006);
d-=c;
if(d<0) {d*=-1;}
if(d<ans1) {ans1=d;ans=i+1;}
}
System.out.println(ans);
	}
}