import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		
		// 計算
		int result = 0;
		int keta = String.valueOf(n).length();
		for(int i = 1; i <= n; i++){
		    int head = Integer.valueOf(String.valueOf(i).substring(0,1));
		    int tail = i%10;
		    if(tail == 0) continue;
		    //System.out.println("i:" + i + " head:" + head + " tail:" + tail + " result:" + result);
		    if(head == tail){
		        result++;
		        int p = 10;
		        for(int j = 2; j <= keta; j++){
		            if((((tail+1)*p - 1)/10)*10 + head <= n){
		                //System.out.println((((tail+1)*p - 1)/10)*10 + head);
		                result += pow(10, j-2);
		            }else if(tail*p + head <= n){
		                result += (n%p)/10;
		                if(n%10 >= head) result++;
		            }
		            p *= 10;
		        }
		    }else{
		        int p = 10;
		        for(int j = 2; j <= keta; j++){
		            if((((tail+1)*p - 1)/10)*10 + head <= n){
		                result += pow(10, j-2);
		            }else if(tail*p + head <= n){
		                result += (n%p)/10;
		                if(n%10 >= head) result++;
		            }
		            p *= 10;
		        }
		    }
		}
		
		// 出力
		System.out.println(result);
	}
}


