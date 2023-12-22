import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
 
                if ((a + b + c == 17) and (a == 5 or a == 7) and (b == 5 or b == 7) and (c == 5 or c == 7)){
                    System.out.println("OK");
                }else{
                   System.out.println("NG");
                }
     }
}              