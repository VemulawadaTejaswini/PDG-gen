import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int xg=1, yg=1;
		int[] g2 = {4,6,9,11};
		if(x == y){
			System.out.println("Yes");
			System.exit(0);
		}
		for(int i=0; i<g2.length; i++){
			if(x == g2[i]){
				xg = 2;
			}
			if(y == g2[i]){
				yg = 2;
			}
		}
		if(xg == yg){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
	}
}
