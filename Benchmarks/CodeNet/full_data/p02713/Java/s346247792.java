import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int max = sc.nextInt();
      	int sum = 0;
        
      for(int a=1;a<=max;a++){
        for(int b=1;b<=max;b++){
          for(int c=1;c<=max;c++){
            int tmp = gcd(b,c);
            sum += gcd(a,tmp);
          }
         
        }
      }
      System.out.println(sum);
	}
  
  	 private static int gcd(int x,int y) {
        int tmp;
        while ((tmp = x % y) != 0) {
            x = y;
            y = tmp;
        }
       return y;
    }
}