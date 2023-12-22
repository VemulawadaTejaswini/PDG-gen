import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long A = scan.nextLong();
		long B = scan.nextLong();
		long C = scan.nextLong();
		long D = scan.nextLong();
		long C1 = C;
		boolean X = true;
		//以下ユークリッドの互除法
		while(X) {
			if(D%C1!=0){
				C1 = D%C1;
			}else{
				X = false;
			}
		}
		long D1 = D/C1;
		long Y = D1*C;
		long minC;
		long maxC; 
		long minD;
		long maxD;
		long minY;
		long maxY;
		
		if(A%C==0) {
			minC = A/C;
		}else{
			minC = A/C+1;
		}
		if(B%C==0) {
			maxC = B/C;
		}else{
			maxC = B/C;
		}
		if(A%D==0) {
			minD = A/D;
		}else{
			minD = A/D+1;
		}
		if(B%D==0) {
			maxD =  B/D;
		}else{
			maxD = B/D;
		}
		if(A%Y==0) {
			minY = A/Y;
		}else{
			minY = A/Y+1;
		}
		if(B%Y==0) {
			maxY = B/Y;
		}else{
			maxY = B/Y;
		}
		//System.out.println(minC);
		//System.out.println(maxC);
		//System.out.println(minD);
		//System.out.println(maxD);
		//System.out.println(minY);
		//System.out.println(maxY);
		
		
		
		long sum = B-A-(maxC-minC)-(maxD-minD)+(maxY-minY);


		System.out.println(sum);

	}

}