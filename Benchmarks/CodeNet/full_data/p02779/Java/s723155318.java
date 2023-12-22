import java.io.*; 
import java.lang.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
public static void main(String[] args){
try{
   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String b = reader.readLine();
   String c = reader.readLine();
  String parts[] = c.split(" ");
 	int n = Integer.parseInt(b);
  int flag = 0;
  for(int i = 0;i<n;i++){
   for(int j = i+1;j<n;j++){
    if(parts[i].compareTo(parts[j])==0){
     	flag = 1;
      System.out.println("YES");
      i = n;
      j= n;
    }
   }
  }
  if(flag == 0){
    System.out.println("NO");
  }
}catch(Exception e){}
}
}