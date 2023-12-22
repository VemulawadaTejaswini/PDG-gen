import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static BufferedReader reader;
	//static field here
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new InputStreamReader(System.in));
		//code here
		String[] ND = readLine();
		int N = Integer.parseInt(ND[0]);
		int D = Integer.parseInt(ND[1]);
		int[][] X = new int[N][D];
		for(int i=0;i<N;i++) {
			String[] t = readLine();
			for(int d=0;d<D;d++) {
				X[i][d]=Integer.parseInt(t[d]);
			}
		}
		
		int cnt = 0;
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				double a = getDistance(X[i],X[j]);
				if(Math.round(a)==a) {cnt++;}
			}
		}
		
		//String[] s = readLine();
		print(cnt);
	}
	
	//functions here
	//note that all methods should be STATIC
	private static double getDistance(int[] p1,int[] p2) {
		double s = 0;
		for(int i=0;i<p1.length;i++) {
			s+=(p1[i]-p2[i])*(p1[i]-p2[i]);
		}
		return Math.sqrt(s);
	}
	
	private static String[] readLine(){
		try{
			return reader.readLine().split(" ");
		}catch(Exception e){
			e.printStackTrace();
			return new String[]{e.getMessage()};
		}
	}
	private static void print(Object o){
		System.out.println(o);
	}
	private static void print(){
		System.out.println();
	}
}