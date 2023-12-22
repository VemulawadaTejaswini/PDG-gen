import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.lang.Character;

public class Main{
	public static void main(String[] args){
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner sc = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
      	String S = sc.next();
      	boolean judge1 = false;
      	boolean judge2 = false;
      	boolean judge3 = false;
      	if(S.charAt(0) == 'A'){
        	judge1 = true;
        }
      	String middle_line = S.substring(2, S.length() - 1);
      	int count = 0;
      	for(int i = 0; i < middle_line.length(); i++){
          	if(Character.isUpperCase(middle_line.charAt(i))){
            	if(middle_line.charAt(i) == 'C'){
                	judge2 = true;
                }
              	count++;
            }
        }
      	if(count == 1){
        	judge3 = true;
        }
      	if(judge1 && judge2 && judge3){
        	out.println("AC");
        }else{
        	out.println("WA");
        }
        out.close();
    }
}