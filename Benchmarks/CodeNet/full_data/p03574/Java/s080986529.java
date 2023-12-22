import java.util.*;
  
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
 
		String[][] S = new String[H][W];
		for(int i=0; i<H; i++){
            for(int j=0; j<W; j++){
            S[i][j] = sc.next();
            }
		}
 
		int count = 0;
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				count = 0;
				if(S[i][j].equals("#")) {
					continue;
				}
 
				if(j-1>=0) {
                    if(i-1>=0&&S[i-1][j-1].equals("#")) 
                    count++;
                    if(S[i][j-1].equals("#")) 
                    count++;
                    if(i+1<H&&S[i+1][j-1].equals("#")) 
                    count++;
				}
 
                if(i-1>=0&&S[i-1][j].equals("#")) 
                count++;
                if(i+1<H&&S[i+1][j].equals("#")) 
                count++;
 
				if(j+1<W) {
                    if(i-1>=0&&S[i-1][j+1].equals("#")) 
                    count++;
                    if(S[i][j+1].equals("#")) 
                    count++;
                    if(i+1<H&&S[i+1][j+1].equals("#")) 
                    count++;
				}
 
				S[i][j] = ""+count;
			}
		}
 
        for(int i=0; i<H; i++){
        for(int j=0; j<W; j++){
            System.out.print(S[i][j]);
            System.out.println();
        }
        }
	}
}



