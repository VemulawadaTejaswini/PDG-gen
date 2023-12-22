import java.util.*;
import java.util.Scanner; 
import java.lang.*;
import java.io.*;

class Test{
public static void main (String[] args) throws java.lang.Exception
	{
  Scanner s = new Scanner(System.in);
   int l = s.nextInt();
   s.nextLine();
  String wrd = s.nextLine();
 
  int count =0;
  for(int i=0; i<l-1; i++){
  	if(wrd.charAt(i) =='#' && wrd.charAt(i+1) =='.'){
  		count++;
  	}
  }
  
  System.out.print(count);

	}
}