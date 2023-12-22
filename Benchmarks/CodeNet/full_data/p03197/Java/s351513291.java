import java.io.*;
import java.util.*;

class Main {
 	public static void main(String args[]) throws IOException {
     	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      	int N = Integer.parseInt(br.readLine());
      	boolean flag = false ;
      	for(int i=0;i<N;i++) {
         	int tmp = Integer.parseInt(br.readLine());
          	if(tmp%2 != 0) {
             	System.out.println("first");
             	return;
            }
        }
        System.out.println("second");
    }
}