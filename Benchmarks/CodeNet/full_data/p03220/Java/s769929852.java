import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner scan=new Scanner(System.in);
int n[]=new int[1000];
int i=0;
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
do {
	n[i]=scan.nextInt();
	i++;
	if(i==a) {break;}
}while(true);
i=0;
double ans1=1000000;
double ans12=100000;
double ans2=1000000;
int ans3=0;
do {
	ans1=b-0.006*n[i];
	ans12=c-ans1;
	if(ans12<0) {ans12=ans12*-1;}
	if(ans12<ans2) {ans2=ans12;ans3=i+1;}
	i++;
	if(i==a) {break;}
}while(true);
System.out.println(ans3);
}
}