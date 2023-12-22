import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      String S = scan.next();
      int hug = 0;
      for(int low;low<=100;low++){
        for(int high;high>=0;high--){
          int mid = (high + low) /2;
          if (low == mid)return;
          if(S.charAt(low) != S.charAt(high))hug++;
        }
      } 
	}
}