import java.util.*;
import java.io.*;

public class Main{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
  int a = s.nextInt();
  int b = s.nextInt();
  int result =0;
  
  if(a>b){
  result = a + Math.max(a-1,b);
  }
  else if(b>a){
    result = b + Math.max(a,b-1);
  }
  else{
  result = 2*a;
  }
  
  System.out.print(result);
  
}
}