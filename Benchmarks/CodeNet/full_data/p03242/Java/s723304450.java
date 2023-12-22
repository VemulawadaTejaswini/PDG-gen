import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      int a = n/100;
      int b = n%100/10;
      int c = n%100%10;
      
        if(a==1) System.out.print(9);
        else if(a==9) System.out.print(1);
        else System.out.print(a);
      
      if(b==1) System.out.print(9);
        else if(b==9) System.out.print(1);
        else System.out.print(b);
      
      if(c==1) System.out.print(9);
        else if(c==9) System.out.print(1);
        else System.out.print(c);
      
	}
}