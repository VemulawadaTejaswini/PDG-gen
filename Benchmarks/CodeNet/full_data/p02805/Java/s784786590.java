import java.util.*;
import java.io.*;

// This file is a "Hello, world!" in Java language by OpenJDK for wandbox.

class Main
{
	public static void main(String[] args)
	{
		new Main().run();
	}
	
	void run(){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		double[] x=new double[N];
		double[] y=new double[N];
		for(int i=0;i<N;++i){
			x[i]=sc.nextDouble();
			y[i]=sc.nextDouble();
		}
		double eps=1e-7;
		double ans=9e5;
		for(int i=0;i<N;++i){
			for(int j=0;j<N;++j){
				double mx=(x[i]+x[j])*0.5;
				double my=(y[i]+y[j])*0.5;
				double l=Math.sqrt((x[i]-x[j])*(x[i]-x[j])+(y[i]-y[j])*(y[i]-y[j]));
				boolean flag=true;
				for(int k=0;k<N;++k){
					double dx=mx-x[k];
					double dy=my-y[k];
					flag&=eps>Math.sqrt(dx*dx+dy*dy)-l/2;
				}
				if(flag)ans=Math.min(ans,l/2);
			}
		}
		
		for(int i=0;i<N;++i){
			for(int j=i+1;j<N;++j){
				for(int k=j+1;k<N;++k){
					double[] pos=f(new double[]{x[i],x[j],x[k]},new double[]{y[i],y[j],y[k]});
					double mx=pos[0];
					double my=pos[1];
					double l=Math.sqrt((x[i]-mx)*(x[i]-mx)+(y[i]-my)*(y[i]-my));
					boolean flag=true;
					for(int m=0;m<N;++m){
						double dx=mx-x[m];
						double dy=my-y[m];
						flag&=eps>Math.sqrt(dx*dx+dy*dy)-l;
					}
					if(flag)ans=Math.min(ans,l/2);
				}
			}
		}
		System.out.println(ans);
	}
	
	double[] f(double[] x,double[] y){
		double[] X=new double[3];
		for(int i=0;i<3;++i){
			X[i]=x[i]*x[i]+y[i]*y[i];
		}
		double[][] v={{X[0]-X[1]},{X[1]-X[2]}};
		double a=x[0]-x[1];
		double b=y[0]-y[1];
		double c=x[1]-x[2];
		double d=y[1]-y[2];
		double det=2*(a*d-c*b);
		if(det==0)return new double[]{0,0};
		return new double[]{1/det*(d*v[0][0]-b*v[1][0]),1/det*(-c*v[0][0]+a*v[1][0])};
	}
	
	
	void tr(Object...o){System.out.println(Arrays.deepToString(o));}
}
// OpenJDK reference:
//   http://openjdk.java.net/

// Java language references:
//   http://docs.oracle.com/javase
	