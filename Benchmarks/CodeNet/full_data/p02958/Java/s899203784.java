import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);		
		int N = in.nextInt();
        int nam = 0;
        int flag = 0;
      
      for(int i = 1; i<=N; i++ ){
        nam = in.nextInt();
        if(nam!=i){flag++;}
        
      }
      if(flag<=2){
		System.out.print("YES");
      }else{System.out.print("NO");}
        
      }
	}