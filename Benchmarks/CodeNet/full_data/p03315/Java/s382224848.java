import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String S = sc.next();
      int T = 0;
      for(int i=0;i<S.length();i++){
        if((S.substring(i,i+1)).contains("+")){
          T = T + 1;
        }else{
          T = T - 1;
        }
      }
      System.out.println(T);
    }
}