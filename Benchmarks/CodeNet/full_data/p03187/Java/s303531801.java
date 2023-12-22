import java.util.Arrays;
import java.util.Scanner;
public class Main {
	private static int L;

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		L=s.nextInt();
		int n=s.nextInt();
		int[] x=new int[n+1];
		x[0]=0;
		int[] c=new int[x.length];
		c[0]=1;
		for(int i=1;i<x.length;i++){
			x[i]=s.nextInt();
		}
		s.close();
		Arrays.sort(x);
		int v0=cals(x,c,0);
		System.out.println(Math.max(v0, 0));
	}

	private static int val(int[] c){
		int n=0;
		for(int cx : c)n +=cx;
		return n;
	}

	private static int cals(int[] x,int[] c,int p){
		c[p]=1;
		int p0=left(x,c,p);
		int p1=right(x,c,p);
		int d0=distLeft(x,p,p0);
		int d1=distRight(x,p,p1);
		if(val(c)+1>=x.length){
			return Math.max(d0, d1);
		}else{
			int[] c2=Arrays.copyOf(c, c.length);
			d0=d0+cals(x,c,p0);
			d1=d1+cals(x,c2,p1);
			return Math.max(d0, d1);
		}
	}

	private static int left(int[] x,int[] c,int v){
		int p=v;
		int n=0;
		while(true){
			if(++n>=x.length)return -1;
			p=(p+1)%c.length;
			if(c[p]==0)break;
		}
		return p;
	}

	private static int right(int[] x,int[] c,int v){
		int p=v;
		int n=0;
		while(true){
			if(++n>=x.length)return -1;
			p=p-1;
			if(p<0)p=c.length-1;
			if(c[p]==0)break;
		}
		return p;
	}

	private static int distLeft(int[] x,int i,int j){
		if(j>i){
			return Math.abs(x[j]-x[i]);
		}else{
			return Math.abs(x[j]+(L-x[i]));
		}
	}

	private static int distRight(int[] x,int i,int j){
		if(j>i){
			return Math.abs(x[i]+(L-x[j]));
		}else{
			return Math.abs(x[j]-x[i]);
		}
	}

}