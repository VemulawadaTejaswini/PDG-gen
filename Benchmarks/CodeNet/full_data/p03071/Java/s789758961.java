import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int B = sc.nextInt();
      int[] S= new int[]{A+(A-1),B+(B-1),A+B};
      
      int max = S[0];
      for (int i = 0; i < S.length; i++) {
        int v = S[i];
        if(v > max){
          max = v;
        }
      }
      System.out.println(max);
    }
}