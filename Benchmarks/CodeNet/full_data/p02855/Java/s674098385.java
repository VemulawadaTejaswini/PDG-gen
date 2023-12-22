import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		char s[][] = new char[H][W];
		int table[][] = new int[H][W];
		boolean[] row = new boolean[H];
		String line;
		for(int i=0;i<H;i++) {
			line = sc.next();
            s[i]= line.toCharArray();
            row[i]=line.contains("#");
        }
        sc.close();
        int now=1;
        for(int i=0;i<H;i++){
            boolean first=true;
            if(row[i]){
                for(int j=0;j<W;j++){
                    if(s[i][j]=='#'){
                        if(!first) now++;
                        else first=false;
                    }
                    table[i][j]=now;
                }
                now++;
            }
        }

		int ins1=-1,ins2=-1;
		for(int i=0;i<H;i++) {
			if(!row[i]) {
				for(int j=0;j<W;j++) {
						for(int k=i;k<H;k++) {
							if(row[k]) {
								ins1 = table[k][j];
								break;
							}
						}
						for(int k=i;k>=0;k--) {
							if (row[k]) {
								ins2 = table[k][j];
								break;
							}
						}
						table[i][j] = Math.max(ins1, ins2);
				}
			}
        }
        
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				System.out.print(table[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
