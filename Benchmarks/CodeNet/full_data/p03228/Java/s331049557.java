import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
      	int k = scn.nextInt();
      	for(int i=1; i<=k; ++i){
          if(a%2==1){
            a = a - 1;
          }
          if(b%2==1){
            b = b - 1;
          }
          int aa = a/2;
          int bb = b/2;
          a = a/2 + bb;
          b = b/2 + aa;
        }
      System.out.print(a);
       System.out.print(" ");
       System.out.print(b);
	}
}