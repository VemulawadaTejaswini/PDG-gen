import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int wa = 0;
        for (int i=1; i <= N; i++) {
          if ( i < 10 ) {
            if ( i >= A && i<= B ){
              wa = wa + i;
            }
          } else if ( i < 100 ) {
            if( ((int)i/10 + (int)i%10) >= A && ((int)i/10 + (int)i%10) <= B){
              wa = wa + i;
            }
          } else if ( i < 1000 ) {
            if( ((int)i/100 + ( (int)i/10 % 10) + i%10) >= A && ((int)i/100 + ( (int)i/10 % 10) + i%10) <= B){
              wa = wa + i;
            }
          } else {
            if( ((int)i/1000 + ( (int)i/100 % 10) + ( (int)i/10 % 10) + i%10) >= A && ((int)i/1000 + ( (int)i/100 % 10) + ( (int)i/10 % 10) + i%10) <= B){
              wa = wa + i;
            }
          }
        }
          System.out.print(wa);
		
	}
}