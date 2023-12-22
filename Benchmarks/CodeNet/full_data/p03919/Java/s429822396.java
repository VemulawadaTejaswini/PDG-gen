import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[][] s = new String[h][w];
		for(int i=0; i<h; i++){
			for(int j=0; j<w; j++){
				s[i][j] = sc.next();
			}
		}
		String sans = "snuke";
		for(int i=0; i<h; i++){
			for(int j=0; j<w; j++){
				if(s[i][j].equals(sans)){
					char c = (char)(j + 'A');
					String ans = c +  "" + (i+1);
					System.out.println(ans);
				}
			}
		}
		sc.close();

	}

}