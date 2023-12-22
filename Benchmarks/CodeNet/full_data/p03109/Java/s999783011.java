import java.util.*;

public class Main{
	public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
      
    String S = scn.next();
	int y1 = 2019;
    int m1 = 4;
    int d1 =30;
    
    int y2 = Integer.parseInt(S.substring(0,4));
    int m2 = Integer.parseInt(S.substring(5,7));
    int d2 = Integer.parseInt(S.substring(8,10));
    
    if(y1>=y2 && m1>=m2 && d1>=d2){
      System.out.print("Heisei");      
    }else{
      System.out.print("TBD");      
    }
    }
}