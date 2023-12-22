import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long a = sc.nextInt();
        long b = sc.nextInt();
      //int min=Math.min(a,b);
      long o=0;
      	for (long i=1;i<=Math.min(a,b);i++){
          if(a%i==0 && b%i==0){
            o++;
            a=a/i;
            b=b/i;
          }
        }
	   System.out.println(o);
	}
}