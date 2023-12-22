
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(-100>a>c){
             System.out.println("No");
             }else if(b>c>100){
             System.out.println("No");
             }else{
             System.out.println("Yes");
             }
}
}