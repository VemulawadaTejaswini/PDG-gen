import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//int[] date=new int[2];
public class  Main {
int i,o,sum,h,s,e,u,ty,yu,ui,n,num,qw;
double m,t,r,j,k,f,d,g,w;
static double l;
String b,c,z,x,v,a,q;
Scanner scan =new Scanner(System.in);
//入力
	public void input() {	
	
	}
	//演算
	public void compute() {
	
		}
//出力
public void output() {
b=scan.next();
String[] names=b.split("");
//for(h=0;h<7;h++) {
//System.out.println(names[h]);
//}
if(names[3].equals(names[4])&&names[5].equals(names[6])) {
	System.out.println("Yes");
}else {
	System.out.println("No");
}
}
	public static void main(String [ ] args) {
		 Main p = new  Main ();
		p.input();
		p.compute();
		p.output();
		}
	}