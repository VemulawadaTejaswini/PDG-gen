import java.io.*; 
import java.lang.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Main{
public static void main(String[] args){
try{
   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String b = reader.readLine();
   String c = reader.readLine();
  String parts[] = c.split(" ");
 	int n = Integer.parseInt(b);
  Arrays.sort(parts);
   int flag = 0;
  for(int i =0;i<n-1;i++){
  	if(parts[i].compareTo(parts[i+1]) == 0){
      flag =1;
      System.out.println("NO");
      i = n;
    }
  }
  
 
  
  if(flag == 0){
    System.out.println("YES");
  }
}catch(Exception e){}
}
}