import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        String a = scan.next();
        boolean isAC = false;
        
        for(int i = 0; i < a.length()-1 ; i++){
          if(a.substring(i,i+1).charAt(0) == 'A' && a.substring(i+1,i+2).charAt(0) == 'C' ){
            isAC = true;
            break;
          }
        }
             
        if( isAC )System.out.println("Yes");
        else System.out.println("No");
	  }
}