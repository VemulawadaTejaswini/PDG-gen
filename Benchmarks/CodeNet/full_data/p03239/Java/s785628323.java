import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int i=0;
int j=0;
int x=0;
int in=0;
int in2=0;
int d[]=new int[a];
Arrays.fill(d, 200000000);
do {
	if(j==0) {
	in=scan.nextInt();
	j=1;
	}
	else if(j==1) {
		in2=scan.nextInt();
		if(in2<=b) {
			d[x]=in;
			x++;
		}
		i++;
		j=0;
	}
	if(i==a) {break;}

}while(true);
Arrays.sort(d);
int c=0;
x=0;
	if(d[0]==200000000) {System.out.println("TLE");}
	else {System.out.println(d[0]);}
	x++;


	}

}
