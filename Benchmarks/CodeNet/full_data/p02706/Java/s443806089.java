import java.util.Scanner;
//int[] date=new int[2];
public class Main {
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
	int[]	date=new int[2];
		for(o=0;o<2;o++) {
		date[o]=scan.nextInt();
		}
		int[] dat=new int[date[1]];
		for(h=0;h<date[1];h++) {
			dat[h]=scan.nextInt();
			sum+=dat[h];
		}
		if(date[0]-sum>-1) {
			System.out.println(date[0]-sum);
		}else {
			System.out.println("-1");
		}
		}
	public static void main(String [ ] args) {
		Main p = new  Main ();
		p.input();
		p.compute();
		p.output();
		}
	}