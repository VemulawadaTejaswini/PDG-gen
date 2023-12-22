import java.util.*;
//import java.util.HashMap;
import java.text.*;
import java.math.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);       

        String str = sc.nextLine().trim();
        String[] strArr = str.split(" ");
        int a = Integer.parseInt(strArr[0]);
        int b = Integer.parseInt(strArr[1]);
        if((b-a) == 1){
            System.out.println((a*(a+1))%2019);
        }else{
            int n = b-a;
            int result = 0;
            int temp = 0;
            for(int i=1; i <= n; i++){
                temp = (a*(a+i))%2019;
                if(result == 0){
                    result = temp;
                }
                if(result > temp){
                    result = temp;
                }
            }
            System.out.println(result);
        }
	}
}
