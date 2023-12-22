import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
      // 整数の入力
		int N = sc.nextInt();
		char[] S = sc.next().toCharArray();
		char[] T = sc.next().toCharArray();
      
      	String answer = "";
      	for(int i=0;i<N;i++){
          answer = answer + String.valueOf(S[i]);
          answer = answer + String.valueOf(T[i]);
        }
      	
      	System.out.println(answer);

      
      	
	}
}