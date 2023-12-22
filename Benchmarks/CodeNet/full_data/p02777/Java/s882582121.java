import java.io.*; 
import java.lang.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
public static void main(String[] args){
try{
   BufferedReader reader =
                   new BufferedReader(new InputStreamReader(System.in));
        String b = reader.readLine();
     
    int n = b.length();
  	String ans = "";
  String x = "x";
  	for(int i=0;i<n;i++){
      ans = ans.concat(x);
     
    }
  System.out.println(ans);
}catch(Exception e){}
}
}