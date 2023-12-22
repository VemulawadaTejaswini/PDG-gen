import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
      
      	int avail = a - b;
      	if ( c > avail ) {
          System.out.println(c - avail);
        }
      	else {
          System.out.println(0);
        }
	}
}