import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      Long output = new Long(0);
      int N = sc.nextInt();
      for(int i = 2; i <= N - 1; i++){
        output += i;
      }
      
      System.out.println(output + N % 2);
	}
}
