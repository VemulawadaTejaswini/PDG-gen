import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String a = sc.next();
        String b[] = a.split("");
      
        int count = 0;
        int half = a.length() / 2;
        for(int i = 0; i < half;i++){
          if(!b[i].equals(b[a.length() - 1 - i])){
            count += 1;
          }
        }
        
      	System.out.println(count);
 
    }
}