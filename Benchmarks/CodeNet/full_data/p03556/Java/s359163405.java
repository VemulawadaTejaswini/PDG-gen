import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long n = sc.nextLong();
        long ans = 0;
        long count = 1;
        while(true){
          if(n > count * count){
          ans = count * count;   
          }else{
              System.out.println(ans);  
              System.exit(0);            
          }
          count +=1;
        }
    }
}