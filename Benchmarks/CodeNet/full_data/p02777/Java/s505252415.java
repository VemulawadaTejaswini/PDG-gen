import java.util.*;
class Main{
	public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
		  String s = sc.next();
      String t = sc.next();
      
      int a= sc.nextInt();
      int b= sc.nextInt();

      String z = sc.next();
      
      if(s.indexOf(z)!=-1){
        a--;
      }
      else if (z.indexOf(z)!=-1){
        b--;
      }
      System.out.println(a+" "+b);
    }
}