import java.util.*;

public class Main{	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] x = new int[N];
		int[] y = new int[N];
		double pi = Math.PI;
		double[] radStart = new double[N];
		double[] radEnd = new double[N];
		boolean[] dead = new boolean[N];
		for(int i=0;i<N;++i){
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			radStart[i] = 0.0;
			radEnd[i] = 2.0*pi;
		}
		
		for(int i=0;i<N;++i){
			for(int j=i+1;j<N;++j){
				if(!dead[i]&&!dead[j]){
					double theta = y[i] == y[j] ? pi/2.0 : Math.atan(solvea(x[i],y[i],x[j],y[j]));
					if(theta < 0.0) theta = pi+theta;
					if(x[i]<=x[j]){
						//i
						if(radEnd[i]<theta && radStart[i]>(theta+pi)) dead[i] = true;
						else{
							if(radStart[i]<theta ||(radStart[i]>pi&&radEnd[i]>theta)) radStart[i] = theta;
							if(radEnd[i]>(theta+pi)) radEnd[i] = theta+pi;
						}
						//j
						if(radEnd[j] != 2*pi && radEnd[j]>(theta+pi) && radStart[j]<theta) dead[j] = true;
						else{
							if(radStart[j]<(theta+pi)) radStart[j] = theta+pi;
							if(radEnd[j] == 2.0*pi ||(radEnd[j]<pi && radEnd[j]>theta)) radEnd[j] = theta;
						}
					}else{
						//j
						if(radEnd[j]<theta && radStart[j]>(theta+pi)) dead[j] = true;
						else{
							if(radStart[j]<theta ||(radStart[j]>pi&&radEnd[j]>theta)) radStart[j] = theta;
							if(radEnd[j]>(theta+pi)) radEnd[j] = theta+pi;
						}
						//i
						if(radEnd[i] != 2*pi && radEnd[i]>(theta+pi) && radStart[i]<theta) dead[i] = true;
						else{
							if(radStart[i]<(theta+pi)) radStart[i] = theta+pi;
							if(radEnd[i] == 2.0*pi ||(radEnd[i]<pi && radEnd[i]>theta)) radEnd[i] = theta;
						}
					}
				}
			}
		}

		for(int i=0;i<N;++i){
			if(dead[i]) System.out.println(0.0);
			else if(radEnd[i]>radStart[i]) System.out.println((radEnd[i]-radStart[i])/(2.0*pi)); 
			else System.out.println((radEnd[i]-radStart[i]+2.0*pi)/(2.0*pi));
		}
		return;
	}
	
	public static double solvea(int x1,int y1,int x2, int y2){
		return -1.0 * (double)(x2-x1)/(double)(y2-y1);
	}
}