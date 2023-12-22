import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int[][] c = new int[3][3];
		int[] a = new int[3];
		int[] b = new int[3];
		boolean find = true;

		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				c[i][j] = sc.nextInt();
			}
		}

		for(int i=0; i<=c[0][0]; i++){
			a[0] = i;
			for(int j=0; j<3; j++){
				b[j] = c[0][j]-a[0];
			}

			a[1] = c[1][0]-b[0];
			for(int j=0; j<3; j++){
				int b1 = c[1][j]-a[1];
				if(b1!=b[j]){
					find=false;
				}
			}
			if(find==true){
				a[2] = c[2][0]-b[0];
				for(int j=0; j<3; j++){
					int b2 = c[2][j]-a[2];
					if(b2!=b[j]){
						find=false;
					}
				}
			}
			if(find==true){
				System.out.println("Yes");
				return;
			}
			find=true;
		}
		System.out.println("No");
	}
}
