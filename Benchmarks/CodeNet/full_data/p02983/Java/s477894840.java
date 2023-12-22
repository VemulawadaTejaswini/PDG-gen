import java.util.*;
import java.text.*;
import java.math.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);       

        String str = sc.nextLine().trim();
        String[] strArr = str.split(" ");
        int a = Integer.parseInt(strArr[0]);
        int b = Integer.parseInt(strArr[1]);
        System.out.println((a*(a+1))%2019);
	}
}