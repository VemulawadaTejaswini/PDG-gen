import java.util.*;
public class Main {
	public static void myout(Object text){//standard output
		System.out.println(text);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      int N = sc.nextInt();
      int K = sc.nextInt();
      int output = K;
      for(int i = 0; i < N - 1; i++){
        output = output * (K - 1);
      }
      myout(output);
	}
}
