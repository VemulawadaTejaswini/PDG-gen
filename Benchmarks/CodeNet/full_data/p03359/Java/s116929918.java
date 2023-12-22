import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		char box[][] = new char[50][50];
		int h = a.nextInt();
		int w = a.nextInt();
		int check1=0,check2=0;
		for(int i=0; i<h ;i++) {
				String s = b.nextLine();
				box[i]= s.toCharArray();
		}
		flag:for(int i=0 ;i<h-1 ;i++) {
			for(int j=0 ;j<w ;j++) {
				check1 = i;
				check2 = j;
				if(j!=w-1) {
					if(box[i][j]==box[i+1][j+1]||box[i][j]==box[i+1][j]) {
						System.out.println("Yes");
						break flag;
					}else{
						if(box[i][j]==box[i+1][j]) {
							System.out.println("Yes");
							break flag;
						}
					}
				}
			}
		}
		if(check1==h-2&&check2==w-1) {
			System.out.println("No");
		}
	}

}
