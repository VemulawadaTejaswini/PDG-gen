import java.util.*;
import java.io.*;

public class Main {
 public static void main (String [] args) throws IOException{
     String input;
     int length = 0;
     int    count = 0;
     StringBuilder sb = new StringBuilder();

   BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
   length=Integer.parseInt(stdin.readLine());
   input=stdin.readLine();
    sb = new StringBuilder(input);

    for (int index = 0; index == length-2; index++){
        if (input.charAt(index) == '#' && input.charAt(index+1) == '.'){
            sb.setCharAt(index, '#');
            count++;
        }
    }
    System.out.println(count);
   }
}
