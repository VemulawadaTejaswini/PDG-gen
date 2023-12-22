import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
      String[] abc = line.split(" ", 0);
		int A = Integer.parseInt(abc[0]);
      int B = Integer.parseInt(abc[1]);
      int C = Integer.parseInt(abc[2]);
      
      if(B == C){
      	System.out.println(A);
      }else if(A == C){
        System.out.println(B);
      }else{
        System.out.println(C);
      }
    }
}