

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		char [][] A = new char[N][N];
		char [][] B = new char[M][M];
		for(int i=0;i<N;i++){
			A[i] = sc.nextLine().toCharArray();
		}
		for(int i=0;i<M;i++){
			B[i] = sc.nextLine().toCharArray();
		}
			
		for(int i=0;i<N;i++){
			for(int j=1;j<N;j++){
				if(A[i][j]==B[i][j])
				for(int k=i+1;k<M+i;k++){
					for(int l=j+1;l<M+j;l++){
						if(A[k][l]!=B[k][l]){
							break;
						}
						else if(k==M+i-1&&l==M+j-1){
							System.out.println("Yes");
							return;
						}
					}
				}
			}
				
		}
		
		System.out.println("No");
	}

}
