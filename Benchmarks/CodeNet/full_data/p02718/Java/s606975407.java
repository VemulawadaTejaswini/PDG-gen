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
	int[] date=new int[2];
for(o=0;o<2;o++) {
	date[o]=scan.nextInt();
}
h=date[1]*4;
int[] dat=new int[date[0]];
for(o=0;o<date[0];o++) {
	dat[o]=scan.nextInt();
	dat[o]=dat[o]/h;
	if(dat[o]>0) {
		s+=1;
	}
}
if(s>date[1]) {
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