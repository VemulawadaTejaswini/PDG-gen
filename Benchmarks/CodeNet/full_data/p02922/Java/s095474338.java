import java.util.*;
import java.io.*;

class Main{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
	int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    PrintWriter out = new PrintWriter(System.out);

    
    int res = 1;
    
    if(a < b){
    	while(a+(a-1)*res<=b){
        	res++;
        }
    }
    out.println(res);
    
    
  }
}
