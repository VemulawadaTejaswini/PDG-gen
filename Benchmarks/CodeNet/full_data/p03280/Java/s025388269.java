import java.util.*;
public class Main{
  	public static void main (String[]args){
      	Scanner scanner = new Scanner (System.in);
      	int w = scanner.nextInt();
      	int l = scanner.nextInt();
      	int total = w*l - w - l;
      	System.out.println(total);
    }
}