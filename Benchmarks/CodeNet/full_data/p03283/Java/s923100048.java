
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int qq = sc.nextInt();
		int counter = 0;

//		int[] l = new int[m];
//		int[] r = new int[m];

		ArrayList l = new ArrayList();
		ArrayList r = new ArrayList();

		for (int i = 0; i < m; i++) {
			int left = sc.nextInt();
			try{
			for(int k=0;k<l.size();k++) {
				if(left < Integer.parseInt((l.get(k)).toString())) {
					continue;
				}else {
					l.add(k,left);
					r.add(k,sc.nextLine());
					break;
				}
			}
			}catch(Exception e) {

			}
		}


		for (int j = 0; j < qq; j++) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			counter= 0 ;

			for(int i = 0; i < m; i++) {
				if(Integer.parseInt(l.get(i).toString()) < p) {
					break;
				}else if(Integer.parseInt(r.get(i).toString()) > q) {
					continue;
				}else {
					counter++;
				}
			}
			System.out.println(counter);
		}




	}

}
