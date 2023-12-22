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
      	int N = Integer.parseInt(sc.next());
      	int Y = Integer.parseInt(sc.next());
      	
      	int x = 0;
      	int y = 0;
      	int z = 0;
      	boolean judge = false;
      	outside:for(int i = 0; i <= N; i++){
        	for(int j = 0; j <= N - i; j++){
            	z = N - i - j;
              	if(10000 * i + 5000 * j + 1000 * z == Y){
                	x = i;
                  	y = j;
                  	judge = true;
                  	break outside;
                }
            }
        }
      	if(judge){
          	out.println(x + " " + y + " " + z);
        }else {
        	out.println("-1 -1 -1");
        }
        out.close();
    }
}