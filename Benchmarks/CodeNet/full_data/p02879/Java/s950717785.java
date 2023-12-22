import java.util.*;
public class Main { 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = 0;
        if(a <= 9 && b <= 9){
            result = a * b;
        }else{
            result = -1;
        }
		System.out.println(result);
     }
}