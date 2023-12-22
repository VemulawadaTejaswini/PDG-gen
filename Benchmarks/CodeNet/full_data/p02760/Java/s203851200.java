import java.util.*;
public class Main {
	private static int a[][];
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	a = new int[3][3];
    	for (int i=0;i < 3; i++) {
    		a[0][i]= sc.nextInt();
		}
    	for (int i=0;i < 3; i++) {
    		a[1][i]= sc.nextInt();
		}
    	for (int i=0;i < 3; i++) {
    		a[2][i]= sc.nextInt();
		}
		int n = sc.nextInt();
    	for (int i=0;i < n; i++) {
    		mark(sc.nextInt());
		}
		if (bingo()) {
			System.out.println("Yes");

		}else{
			System.out.println("No");
		}
    }
    private static void mark(int m) {
    	for (int i=0;i < 3; i++) {
    		if (a[0][i]==m) {
    			a[0][i]=1;
    			return;
    		}
    	}
    	for (int i=0;i < 3; i++) {
    		if (a[1][i]==m) {
    			a[1][i]=1;
    			return;
    		}
    	}
    	for (int i=0;i < 3; i++) {
    		if (a[2][i]==m) {
    			a[2][i]=1;
    			return;
    		}
    	}
    }
    private static boolean bingo() {
    	if (a[0][0]==1 && a[0][1]==1 && a[0][2]==1 ){
    		return true;
    	}
    	if (a[1][0]==1 && a[1][1]==1 && a[1][2]==1 ){
    		return true;
    	}
    	if (a[2][0]==1 && a[2][1]==1 && a[2][2]==1 ){
    		return true;
    	}
    	if (a[0][0]==1 && a[1][0]==1 && a[2][0]==1 ){
    		return true;
    	}
    	if (a[0][1]==1 && a[1][1]==1 && a[2][1]==1 ){
    		return true;
    	}
    	if (a[0][2]==1 && a[1][2]==1 && a[2][2]==1 ){
    		return true;
    	}
    	if (a[0][0]==1 && a[1][1]==1 && a[2][2]==1 ){
    		return true;
    	}
    	if (a[2][0]==1 && a[1][1]==1 && a[0][2]==1 ){
    		return true;
    	}
    	return false;
    }
}



