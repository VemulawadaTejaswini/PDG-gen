import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      String str = sc.next();
      int n = str.length();
      boolean a = str.substring(0,1).equals("A");
      int count1 = 0;
      boolean b = false;
      int memo = 0;
      for(int i = 1;i < n-1;i++){
      	if(str.substring(i,i+1).equals("C")){
          count1++;
          memo = i+1;
        }
      }
      if(count1 == 1){
      	String low1 = str.substring(0,1).toLowerCase();
        String low2 = str.substring(2,memo-1).toLowerCase();
        String low3 = str.substring(memo,str.length()).toLowerCase();
        if(str.substring(0,1).equals(low1)&&str.substring(2,memo-1).equals(low2)&&str.substring(memo,str.length()).equals(low3));
        b = true;
      }
      if(a&&b)System.out.println("AC");
      else System.out.println("WA");
    }
}