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
		int[] c=new int[n+1];
		c[0]=1;
		for(int i=1;i<x.length;i++){
			x[i]=s.nextInt();
		}
		s.close();
		Arrays.sort(x);
		int num=0;
		int st=0;
		while(true){
			int p1=search01(x,c,st);
			if(p1==-1)break;
			int p2=search02(x,c,st);
			int d1=dist1(x,st,p1);
			int d2=dist2(x,st,p2);
			if(d1>d2){
				num +=d1;
				c[p1]=1;
				st=p1;
			}else{
				num +=d2;
				c[p2]=1;
				st=p2;
			}
		}
		System.out.println(num);
	}

	private static int search01(int[] x,int[] c,int p){
		int n=0;
		while(true){
			n++;
			p=(p+1)%c.length;
			if(c[p]==0)break;
			if(n>=x.length)return -1;
		}
		return p;
	}

	private static int search02(int[] x,int[] c,int p){
		int n=0;
		while(true){
			n++;
			p=(p-1)%c.length;
			if(p<0)p=c.length+p;
			if(c[p]==0)break;
			if(n>=x.length)return -1;
		}
		return p;
	}

	private static int dist1(int[] x,int i,int j){
		return Math.abs(x[j]-x[i]);
	}

	private static int dist2(int[] x,int i,int j){
		return Math.abs(((L-x[i])+(L-x[j]))%L);
	}

}