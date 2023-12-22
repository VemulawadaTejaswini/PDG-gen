import java.util.*;
class Main{
  
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int an = a/b;
      if(a%b == 1) an +=1;
      System.out.println(an);
	}
 
}