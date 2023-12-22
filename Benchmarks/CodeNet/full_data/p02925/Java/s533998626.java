import java.util.Scanner;

public class Main {
	public static void main(String args[]) {	
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		String[][] b = new String[a+1][a+1];
		int[] point = new int[a+1];
		for(int i=1;i<=a;i++) {
			point[i]=0;
			b[i] = sc.nextLine().split(" ");
		}
		
		b[0][0] = "0";
		
		boolean esc=false;
		int day=0;
		for(;;) {
			day++;
			int[] pls = new int[a+1];
			for(int i=1;i<=a;i++) {
				
				int in = Integer.parseInt(b[i][point[i]]);
				if(b[in][point[in]].equals(Integer.toString(i))) {
					pls[i] = 1;
					pls[in] = 1;
				}
				
			}
			boolean non = true;
			for(int j=1;j<=a;j++) {
				if(pls[j]==1) {
					point[j]++;
					non = false;
					if(point[j]>=a-1) {
						b[j][0]="0";
						point[j]=0;
					}
				}
			}
			
			if(non)break;
			
			esc=true;
			for(int i=1;i<=a;i++) {
				if(!b[i][0].equals("0")){
					esc = false;
				}
			}
			
			if(esc)break;
			
		}
		
		if(esc) {
			System.out.println(day);
		}else {
			System.out.println(-1);
		}
	}
}
