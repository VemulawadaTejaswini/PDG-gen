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
      	String S = sc.next();
      	int ans = 0;
		for(int i = 1; i < N; i++){
          //out.println(S.substring(0, i) + " " + S.substring(i, N));
         	int count = Count(S.substring(0, i), S.substring(i, N));
          	ans = Math.max(ans, count);
        }
      	out.println(ans);
    	out.close();
    }
  	private static int Count(String front, String back){
      	int count = 0;
      	for(char c = 'a'; c <= 'z'; c++){
          	boolean front_judge = false;
      		boolean back_judge = false;
        	for(int i = 0; i < front.length(); i++){
              	if(c == front.charAt(i)){ front_judge = !front_judge; break;}
            }
          	for(int i = 0; i < back.length(); i++){
              	if(c == back.charAt(i)){ back_judge = !back_judge; break;}
            }
          if(front_judge && back_judge){
          	count++;
          }
        }
    	return count;
    }
}