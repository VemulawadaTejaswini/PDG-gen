
import java.io.*;
import java.util.*;
 

public class Main {

 public static void main(String[] args){
       InputStream in = System.in;
       Scanner sc = new Scanner(in);
       
       int N = sc.nextInt();
       int Y = sc.nextInt();
       
       for(int x = 0; x <= N; x++){
       		for(int y = 0; y <= N - x; y++){
			int z = N - (x + y);
			int checker = (x * 10000) + (y * 5000) + (z * 1000);
			
			if(checker == Y){
				System.out.println(x + " " + y + " " + z);
				System.exit(0);
			}
       		}
       }
       
       System.out.println("-1 -1 -1");
       
 }

}