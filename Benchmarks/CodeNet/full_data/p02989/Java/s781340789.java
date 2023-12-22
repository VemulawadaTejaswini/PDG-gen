import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
        int nam[] = new int[n];
      
      for(int i = 0 ;i < n ;i++){
       nam[i] =  in.nextInt();
      }
      Arrays.sort(nam);
     
      if(nam[(n/2)-1]==nam[n/2]){System.out.print(0);}
      else{System.out.print(nam[n/2]-nam[(n/2)-1]);}
      
      
      
	}
}