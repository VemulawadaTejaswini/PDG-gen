import java.util.Scanner;
public class Main {
public static void main(String []args) {
	Scanner tc = new Scanner (System.in);
	int n;
	int m ;
	int cont =0;
	n=tc.nextInt();
	m=tc.nextInt();
	int[][] matriz = new int[m][2];
	for(int i=0;i<matriz.length;i++) {
		for(int j=0;j<2;j++) {
			matriz[i][j]= tc.nextInt();
			if(m==matriz[i][j]) {
				cont ++;
			}else {
				if(m==matriz[i][j]+1) {
					cont++;
				}
			}
			if(n==m) {
				System.out.println(n);
			}
		}
	}
	System.out.println(cont);
}
}