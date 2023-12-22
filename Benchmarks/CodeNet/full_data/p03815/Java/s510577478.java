import java.util.Scanner;
public class Main {
	public static String plas(String a,String b){
		String q="";
		String w=" ";
		int alen=a.length();
		int blen=b.length();
		int plas=0;
		int ku=0;
		String a1="1";
		String b1="1";
		int a2=0,b2=0;
		int z=0,y=0,ir=1,ir2=0;
		if(alen>blen)
			ir=0;
		if(alen==blen)
			ir2=1;
		if(ir==0||ir2==1){
			y=alen-1;
			z=blen-1;
			while(z>=0){
				a1=a.substring(y,y+1);
				b1=b.substring(z,z+1);
				a2=Integer.valueOf(a1);
				b2=Integer.valueOf(b1);
				plas=a2+b2+ku;
				ku=plas/10;
				w=String.valueOf(plas%10);
				q=w+q;
				y--;
				z--;
			}
			while(y>=0){
				a1=a.substring(y,y+1);
				a2=Integer.valueOf(a1);
				plas=a2+ku;
				ku=plas/10;
				w=String.valueOf(plas%10);
				q=w+q;
				y--;
			}
		}
		else{
			z=alen-1;
			y=blen-1;
			while(z>=0){
				a1=a.substring(z,z+1);
				b1=b.substring(y,y+1);
				a2=Integer.valueOf(a1);
				b2=Integer.valueOf(b1);
				plas=a2+b2+ku;
				ku=plas/10;
				w=String.valueOf(plas%10);
				q=w+q;
				y--;
				z--;
			}
			while(y>=0){
				b1=b.substring(y,y+1);
				b2=Integer.valueOf(b1);
				plas=b2+ku;
				ku=plas/10;
				w=String.valueOf(plas%10);
				q=w+q;
				y--;
			}
		}
		if(ku!=0)
			q=ku+q;
		return q;
	}
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		String x=stdIn.next();
		String a="",b="0",b1="0",c="0",c1="0",d="1",e="",f="";
		int z=x.length(),y=0,m=0,n=0,v=0,w=0;
		while(true){
			if(y>z)
				break;
			else
				if(y==z){
					m=0;
					while(m<y){
						e=b1.substring(m,m+1);
						f=x.substring(m,m+1);
						v=Integer.valueOf(e);
						w=Integer.valueOf(f);
						if(v>w){
							n=1;
							break;
						}
						if(v<w)
							break;
						m++;
					}
				}
			if(m==y&&y!=0)
				break;
			if(n==1)
				break;
			a="6";
			b=b1;
			b1=plas(a,b);
			c=c1;
			c1=plas(c,d);
			y=b1.length();
			if(y>z)
				break;
			else
				if(y==z){
					m=0;
					while(m<y){
						e=b1.substring(m,m+1);
						f=x.substring(m,m+1);
						v=Integer.valueOf(e);
						w=Integer.valueOf(f);
						if(v>w){
							n=1;
							break;
						}
						if(v<w)
							break;
						m++;
					}
				}
			if(m==y)
				break;
			if(n==1)
				break;
			a="5";
			b=b1;
			b1=plas(a,b);
			c=c1;
			c1=plas(c,d);
			y=b1.length();
		}
		System.out.println(c1);
	}
}