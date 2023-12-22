import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
  		
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      	int stack;
      	
      	a *= 100;
      	if((a/100)%2==1) a+=4;
      	b *= 100;
      
      	boolean b1 = (a+96)*100/8 < b*100/10;
      	if((a+96)%100 == 0) b1 = (a+88)*100/8 < b*100/10;
      	boolean b2 = (b+90)*100/10 < a*100/8;
      	boolean b3 = a*100/8 < b*100/10;
      
      	if(b1 || b2) System.out.println(-1);
      	else if(b3) {
          stack = b*100/10/100;
          if((int)(stack * 0.08) == a /100) System.out.println(stack);
          else System.out.println(stack + 1);
        }
        else if(!b3) {
          stack = a*100/8/100;
          if((int)(stack * 0.1) == b/100) System.out.println(stack);
          else System.out.println(stack + 1);
        }
        
	}
}
