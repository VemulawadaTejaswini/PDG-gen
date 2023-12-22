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
int[] date=new int[h+1];
for(o=h;o>0;o--) {
	date[o]=o;
    if(date[h+1]%3!=0&&date[h+1]%5!=0){
    date[h+1]=0;
  }
 // System.out.println(date[o]);
	if(date[o]%3==0) {
date[o]=0;
	}else if(date[o]%5==0) {
date[o]=0;
	}

	e+=date[o];
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