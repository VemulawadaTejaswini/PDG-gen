import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      String s = sc.next();
      int kiroku1 = 0;
      int kiroku2 = 0;
      int count  = 0;
      for(int i = 0;i<n;i++){
         if(s.charAt(i)=='A'){
            kiroku1 = i;
         }
         if(s.charAt(i)=='B'){
            kiroku2 = i;
         }
         if(s.charAt(i)=='C'){
               count++;
            }
      }
      System.out.println(count);            
   }
}
