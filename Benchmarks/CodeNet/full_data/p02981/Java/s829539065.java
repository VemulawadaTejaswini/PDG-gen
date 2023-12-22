import java.util.*;
import java.math.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        sc.close();
        String[] strArr = str.split(" ");
        int n = Integer.parseInt(strArr[0]);
        int a = Integer.parseInt(strArr[1]);
        int b = Integer.parseInt(strArr[2]);
        int train = n * a;
        if(train < b){
            System.out.println(train);
        }else{
            System.out.println(b);
        }
	}
}