import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();

		int[] a = new int[n];
		for(int i =0 ; i<n;i++) {
			a[i] = sc.nextInt();
		}

		int[][] dual = new int[20][n+1];
		for(int i=0;i<20;i++) {
			dual[i][0]=0;
		}
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<20;j++) {
				if(Math.pow(2, 19-j)<=a[i]) {
					dual[j][i+1]=1;
					a[i]-=Math.pow(2, 19-j);
				}else {
					dual[j][i+1]=0;
				}
			}
		}
		for(int i = 1;i<n+1;i++) {
			for(int j = 0;j<20;j++) {
				dual[j][i]+= dual[j][i-1];
			}
		}

		int counter  =0;
		boolean flag  =true;
		int[] holder = new int[20];
		for(int i =0; i<20;i++) {
			holder[i]=1;
			for(int j=0;j<n+1;j++) {
				flag = true;
				for(int k=holder[i];k<n+1;k++ ) {
					if((dual[i][k]-dual[i][j])>1) {
						dual[i][j]=k;
						holder[i]=k;
						flag=false;
						break;
					}
					
				}
				if(flag) {
					dual[i][j]= n+1;
					holder[i]=n+1;
				}
			}
		}

		for(int i =0;i<n;i++) {
			int currentBest = 100000;
			for(int j=0;j<20;j++) {
				if(currentBest>dual[j][i]) {
					currentBest=dual[j][i];
				}
			}
			counter= counter+currentBest-i-1;
		}




		System.out.println(counter);

	}

}
/*
class City{
	int order;
	int prefecture;
	int year;
	int number;
	City(int order,int prefecture, int year){
		this.order = order;
		this.prefecture = prefecture;
		this.year = year;
	}
}
*/