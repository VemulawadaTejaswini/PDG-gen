import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int n = sc.nextInt();
        int k = sc.nextInt();
        int s = 0;
        int count = 0;
        while(true){
            int a = sc.nextInt();
            if(a == 1){
                break;
            }
            s++;
        }
        if(s != 0){
            count += s/(k-1);
        }
        if(s != n-1){
            count += (n-1-s)/(k-1);
        }
      if(s%(k-1) != 0){
        count++;
      }
      if((n-1-s)%(k-1) != 0){
        count++;
      }
		System.out.println(count);
    }
}