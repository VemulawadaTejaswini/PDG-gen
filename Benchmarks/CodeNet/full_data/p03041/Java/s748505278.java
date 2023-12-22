import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      int N = sc.nextInt();
      int K = sc.nextInt();
      String S = sc.next();
      String output = "";
      for(int i = 0; i < N; i++){
        if(i + 1 == K){
          output += S.substring(i , i + 1).toLowerCase();
        }else{
          output += S.substring(i , i + 1);
        }
      }
      System.out.println(output);
	}
}
