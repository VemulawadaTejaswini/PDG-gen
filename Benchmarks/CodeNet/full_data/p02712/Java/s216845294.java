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
		h=scan.nextInt();
		for(o=1;o<=h;o++) {
		 //System.out.println(o);
		 
			if(o%3==0) {
		s=0;
			}else if(o%5==0) {
		s=0;
			}else {
				s=o;
			}
			e+=s;
		}
		System.out.println(e);
		}
	public static void main(String [ ] args) {
		 Main p = new  Main ();
		p.input();
		p.compute();
		p.output();
		}
	}