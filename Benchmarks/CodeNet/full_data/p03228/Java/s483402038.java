import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
int i=0; 
do {
	if(a%2==1) {a-=1;}
	b=b+(a/2);
	a=a/2;
	i++;
	if(c==i) {break;}
	if(b%2==1) {b-=1;}
	a=a+(b/2);
	b=b/2;
	i++;
	if(c==i) {break;}

}while(true);
System.out.println(a+" "+b);
	}
}
