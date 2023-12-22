import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int c = sc.nextInt();
    int[]b = new int[m];
    int[][]a = new int[n][m];
    
    for(int i=0; i<m; i++) {
    	b[i] = sc.nextInt();
    }
    for(int i=0; i<n; i++) {
    	for(int j=0; j<m; j++) {
    		a[i][j] = sc.nextInt();
    	}
    }
    int cou = 0;
    for(int i=0; i<n; i++) {
    	int al = 0;
    	for(int j=0; j<m; j++) {
     		al += a[i][j]*b[j];
    	}
    	if(al + c > 0) {
    		cou++;
    	}
    }
    System.out.println(cou);
    }
}