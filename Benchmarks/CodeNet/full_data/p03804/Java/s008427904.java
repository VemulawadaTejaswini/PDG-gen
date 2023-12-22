import java.util.*;
class Main {
	public static void main(String[]args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int m = stdIn.nextInt();
		String [][]a = new String[n][n];
		String [][]b = new String[m][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				a[i][j]=stdIn.next(); 
			}
			System.out.println();
		}
		for(int i=0;i<m;i++){
			for(int j=0;j<m;j++){
				a[i][j]=stdIn.next(); 
			}
			System.out.println();
		}
		if(b[m][m].indexOf(a[n][n])!=-1){
			System.out.println("Yes");
		}else System.out.println("No");
		
		
		
	}
}
