import java.util.ArrayList;
import java.util.Scanner;

class Main{

	static long[] a;
	static	int N ;
	static	int M ;


	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);

		 String s[] = scanner.next().split("T", -1);
	        int x = scanner.nextInt();
	        int y = scanner.nextInt();
	        
	        ArrayList<Integer> tate = new ArrayList<>();
	        ArrayList<Integer> yoko = new ArrayList<>();
	        
	        
	        for (int i = 1; i < s.length; i++) {
	            if (i % 2 == 0) {		
	                yoko.add(s[i].length());
	            } else {
	                tate.add(s[i].length());
	            }
	        }
	        
	        
	        boolean yokodp[][] = new boolean[yoko.size() + 1][160001];
	        yokodp[0][s[0].length() + 8000] = true;						//マイナスにも対応できるように16000あらかじめ用意しておき、8000を初期位置にする
	        int i = 0;
	        for (Integer dx : yoko) {						//yokoに入っている全ての要素をだす
	            for (int j = 0; j < 16000; j++) {
	                if (yokodp[i][j]) {
	                    if (j + dx <= 16000) {
	                       yokodp[i + 1][j + dx] = true;
	                    }
	                    if (j - dx >= 0) {
	                        yokodp[i + 1][j - dx] = true;
	                    }
	                }
	            }
	            i++;
	        }
	        
	        
	      boolean[][] tatedp = new boolean[tate.size() + 1][16001];
	      tatedp[0][8000] = true;
	        i = 0;
	        for (Integer dy : tate) {
	            for (int j = 0; j < 16000; j++) {
	                if (tatedp[i][j]) {
	                    if (j + dy <= 16000) {
	                       tatedp[i + 1][j + dy] = true;
	                    }
	                    if (j - dy >= 0) {
	                        tatedp[i + 1][j - dy] = true;
	                    }
	                }
	            }
	            i++;
	        }
	        
	        System.out.println(yokodp[yoko.size()][x + 8000] & tatedp[tate.size()][y + 8000] ? "Yes" : "No");






	}


}


