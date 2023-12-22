import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	InputStream inputStream = System.in;
    	OutputStream outputStream = System.out;
    	Scanner sc = new Scanner(inputStream);
    	PrintWriter out = new PrintWriter(outputStream);
      	int H = Integer.parseInt(sc.next());
      	int W = Integer.parseInt(sc.next());
      	char table[][] = new char[50][50];
      	for(int i = 0; i < H; i++){
          	String line = sc.next();
 	 	    for(int j = 0; j < W; j++){
              	table[i][j] = line.charAt(j);
              	//out.print(table[i][j]);
            }
          	//out.println();
        }
      if(judge(W, H, table) == true){
      	out.println("Yes");
      }else{
      	out.println("No");
      }
    	out.close();
    }
  	private static boolean judge(int W, int H, char[][] table) {
    	int dx[] = {1, -1, 0, 0};
      	int dy[] = {0, 0, 1, -1};
      	boolean judge = false;
      	outside:for(int i = 0; i < H; i++){
        	for(int j = 0; j < W; j++){
				if(table[i][j] == '#'){
                	for(int k = 0; k < 4; k++){
                    	int x = dx[k] + i;
                      	int y = dy[k] + j;
                      	if(0 <= x && x < H && 0 <= y && y < W && table[x][y] == '#'){
                        	judge = true;
                          	break outside;
                        }
                     }
                }            	
            }
        }
      return judge;
    }
}