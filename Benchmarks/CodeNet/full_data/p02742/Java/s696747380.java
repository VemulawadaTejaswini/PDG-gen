import java.util.*;
import java.math.BigInteger;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        long W = sc.nextLong();
        long ans;
       
        if(H == 1 || W == 1){
          System.out.println(1);
        }else if(H % 2 == 0){
          ans = H*W/2;
          System.out.println(ans);
        }else{
          ans = (H*W/2)+1;
          System.out.println(ans);
        }  
	}

}