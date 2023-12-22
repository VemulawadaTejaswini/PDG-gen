import java.util.*;
 
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int num = Integer.parseInt(sc.nextLine());
   long jap = long.parseLong(sc.nextLine());
   long btc = long.parseLong(sc.nextLine());
   long sum = jap + btc *380000.0;
   System.out.println(sum);
	}
}