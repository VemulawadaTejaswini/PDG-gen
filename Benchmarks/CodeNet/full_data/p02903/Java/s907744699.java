import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		int matrix[][] = new int[H][W];
		for(int i = 0; i<matrix.length;i++) {
			for(int j = 0; j<matrix[i].length;j++) {
				matrix[i][j] = 0;
			}
		}
		int counter[] = new int [W];
		for(int i = 0; i<counter.length;i++) {
			counter[i] = 0;
		}
		int putAcount;
		int Noflag = 0;
      	int cBf = 0;
		if(B==0) {
			if(H!=1) {
				Noflag=1;
			}else {
				B = B + 1;
              	cBf=1;
			}
		}
		if(A==0) {
			if(W!=1) {
				Noflag = 1;
			}
		}
		if(Noflag==0) {
			for(int i = 0; i<matrix.length;i++) {
				putAcount = 0;
				for(int j = 0; j<matrix[i].length;j++) {
					if(counter[j]<B) {
						if(putAcount<A) {
							matrix[i][j] = 1;
							counter[j] = counter[j] + 1;
							putAcount++;
						}else if((i == matrix.length-1) && (A==putAcount) && (cBf!=1)) {
							Noflag = 1;
						}
					}
					if(j == (matrix[i].length-1)) {
						if(putAcount!=A) {
							Noflag = 1;
						}
					}
				}
				if(Noflag==1) {
					break;
				}
			}
		}

		if(Noflag==0) {
			for(int i = 0; i<matrix.length;i++) {
				for(int j = 0; j<matrix[i].length;j++) {
					System.out.print(matrix[i][j]);
				}
				System.out.println();
			}
		}else {
			System.out.println("No");
		}
	}

}
