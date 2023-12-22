import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int count;
      if(a==b && b==c){
      	count = 1;
      }else if(a==b || b==c || c==a){
		count = 2;
      }else{
      	count=3;
      }
      System.out.println(count);
    }
}