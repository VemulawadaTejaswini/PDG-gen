import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X[] = new int[N];
		int Y[] = new int[N];
		int H[] = new int[N];


		for(int n=0;n<N;n++){
			X[n] = sc.nextInt();
			Y[n] = sc.nextInt();
			H[n] = sc.nextInt();
		}

		outside:for(int y=0;y<=100;y++){
			for(int x=0;x<=100;x++){
				int h = -1;
				int n;
				for(n=0;n<N;n++){
					if(n==0){
						h = H[n]+Math.abs(X[n]-x)+Math.abs(Y[n]-y);
					}else{
						int hh = H[n]+Math.abs(X[n]-x)+Math.abs(Y[n]-y);
						if(h != hh) break;
					}
				}

				if(n==N){
					System.out.println(x+" "+y+" "+h);
					break outside;
				}
			}			
		}
	}
}