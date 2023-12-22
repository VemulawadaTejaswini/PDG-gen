import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String c[] = new String[a];
		char d[][] = new char[a][b];
		boolean f1[] = new boolean[a];
		boolean f2[] = new boolean[b];
		
		
		for (int i=0; i<a; i++){
			c[i] = sc.next();
			for (int j=0; j<b; j++){
				d[i][j] = c[i].charAt(j);
			}
		}
		
		for (int i=0; i<a; i++){
			f1[i] = false;
			for (int j=0; j<b; j++){
				if (d[i][j] != '.'){
					f1[i] = true;
				}
			}
		}
//		for (int i=0; i<f1.length; i++){
//			System.out.print(f1[i]+",");
//		}
//		System.out.println("");
		
		
		boolean temp = false;
		for (int j=0; j<b; j++){
			f2[j] = false;
			temp = false;
			for (int i=0; i<a; i++){
//				System.out.print(d[i][j]);
				if (d[i][j] != '.'){
					temp = true;
//					System.out.print("yes");
				}
			}
			if (temp){
//				System.out.print("aaa");
				f2[j] = true;
			}
//			System.out.println("");
//			System.out.println("-----------");
		}
//		for (int i=0; i<f2.length; i++){
//			System.out.print(f2[i]+",");
//		}
//		System.out.println("");

		for (int i=0; i<a; i++){
			if (!f1[i]){
				continue;
			}
			for (int j=0; j<b; j++){
				if (!f2[j]){
					continue;
				}
				System.out.print(d[i][j]);
			}
			System.out.println("");
		}
		
		
		
//		System.out.println(a-b+1);
		
		
		
		
	}

}
