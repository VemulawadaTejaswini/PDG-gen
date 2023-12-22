import java.util.ArrayList;
import java.util.Scanner;

public class C_145 {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int[]x = new int[N];
			int[]y = new int[N];
			
			double answer = 0.0;
			
			for(int i = 0;i<N;i++) {
				x[i] = scan.nextInt();
				y[i] = scan.nextInt();
				
			}
			
			ArrayList<Double> kyori = new ArrayList<Double>();
			
			ArrayList<Integer> nantouri = new ArrayList<Integer>();
			
			for(int i = 1;i<=N;i++) {
				nantouri.add(i);
			}
			
			goukei(N,0,0,x,y,kyori,nantouri,0);
			
			System.out.println(kyori.size());
			double goukei = 0;
			
			for(int i = 0;i<kyori.size();i++) {
				System.out.println(kyori.get(i));
				goukei+=kyori.get(i)-1;
				
			}
			
			System.out.println(goukei/(double)kaijyou(N));
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
	}
	private static void goukei(int n,int x,int y,int[]X,int[]Y,
			ArrayList<Double> Kyori,ArrayList<Integer> nantouri,double ichiji) {
		
		if(n==0) {
			Kyori.add(ichiji);//リストの数はN!個ある	
			System.out.println("ok");
		}else {
			
			
		for(int i = 0;i<nantouri.size();i++) {
			ArrayList<Integer> nan = new ArrayList<Integer>(nantouri);
			int s = nan.get(i);
			System.out.println(s);
			int dx = X[s-1];//目的地
			int dy = Y[s-1];//目的地
			System.out.println("呼び出された");
			//System.out.println(x);
			//System.out.println(y);
			
			double ichijikyori =ichiji+Math.sqrt((dx-x)*(dx-x)+(dy-y)*(dy-y));
			nan.remove(i);
			
			System.out.println(nan.size());
			
			goukei(n-1,dx,dy,X,Y,Kyori,nan,ichijikyori);
			

				
		}
		
		}
		
	}
	
	
	
	
	
	
	private static int kaijyou(int n) {
		if(n==1)return 1;
		return n*kaijyou(n-1);
	}

}
