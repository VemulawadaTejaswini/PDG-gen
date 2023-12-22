import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
        int nam[] = new int[N];
        int max1 = 0;
        int max2 = 0;
      
      for(int i = 0;i < N ; i++){
       nam[i] =  in.nextInt();
        if(nam[i]>=max1){max1=nam[i];}
        else if(nam[i]>=max2){max2=nam[i];}
      }
      
      if(max2==0){
      for(int i = 0;i < N ; i++){
        	System.out.println(max1);
      	} 
      }
      else{
         for(int i = 0;i < N ; i++){
        	if(nam[i]==max1){System.out.println(max2);}
           else{System.out.println(max1);}
      	} 
        
      }

	}
}