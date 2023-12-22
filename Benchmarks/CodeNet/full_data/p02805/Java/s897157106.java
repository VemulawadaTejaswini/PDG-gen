import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x[] = new int[n];
		int y[] = new int[n];
		
		for(int i=0;i<n;i++){
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		double l=0,r = 5000;
		while(r-l >= 1e-7){
			double m = (l+r)/2;
			
			boolean ok = false;
			
			for(int i=0;i<n;i++){
				for(int j=i+1;j<n;j++){
					double d = dis(x[i], y[i], x[j], y[j]);
					if(!isZero(d-2*m) && d > 2*m){
						break;
					}
					
					double h = Math.sqrt(m*m - d*d/4);
					double mx = (double)(x[i] + x[j])/2;
					double my = (double)(y[i] + y[j])/2;
					
					double[] vec = pv(h, -y[j] + y[i], x[j] - x[i]);
					
					double itx = mx + vec[0];
					double ity = my + vec[1];
					
					boolean ins1 = true, ins2 = true;
					for(int k=0;k<n;k++){
						if(i==k || j==k)
							continue;
						
						double dt = dis(itx, ity, x[k], y[k]);
			
						if(!isZero(dt-m) && dt > m){
							ins1 = false;
							break;
						}
					}
					itx = mx - vec[0];
					ity = my - vec[1];
					for(int k=0;k<n;k++){
						if(i==k || j==k)
							continue;
						double dt = dis(itx, ity, x[k], y[k]);
						
						if(!isZero(dt-m) && dt > m){
							ins2 = false;
							break;
						}
					}
					
					if(ins1 || ins2){
						ok = true;
						break;
					}
				}
				
				if(ok)
					break;
			}
			
			if(ok){
				r = m;
			}
			else{
				l = m;
			}
		}
		System.out.println((l+r)/2);
		
	}
	
	static boolean isZero(double d){
		return  Math.abs(d)<1e-8;
	}
	static double[] pv(double len, double x, double y){
		double plen = dis(x, y, 0,0);
		return new double[]{x * len / plen, y * len / plen};
	}
	static double dis(double x1, double y1, double x2, double y2){
		return Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));
	}
}
