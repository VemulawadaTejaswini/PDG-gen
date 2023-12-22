import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x[][] = new int[3][m + 1];
		x[0][0] =0;
		x[1][0] = 0;
		x[2][0] = 0;
int deta[]=new int[n+1];
int ko=0;
int key=0;
		for (int i = 1; i <= m; i++) {
			x[0][i] = sc.nextInt();
			x[1][i] = sc.nextInt();
			x[2][i] = sc.nextInt();
boolean zero=true;
boolean one =true;
			for(int j=0;j<=ko;j++){
				if(x[0][i]==deta[j]){
					zero=false;
				}
				if(x[1][i]==deta[j]){
					one=false;
				}
			}
			if(zero){
				ko++;
				deta[ko]=x[0][i];
			}
			if(one){
				ko++;
				deta[ko]=x[1][i];
			}
if(zero||one){
	key++;
}

		}



		System.out.println(n-key);
	}
}