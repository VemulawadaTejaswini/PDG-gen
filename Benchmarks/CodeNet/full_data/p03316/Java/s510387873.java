import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
        int sum = 0;
		
        String sn = "" + n;
        
        for(String s : sn.split("")) {
          sum += Integer.parseInt(s);
        }
      
		// 出力
		System.out.println(n % sum == 0 ? "Yes" : "No");
	}
}