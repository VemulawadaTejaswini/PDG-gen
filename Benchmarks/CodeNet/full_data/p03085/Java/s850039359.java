import java.util.*;
public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String x = sc.next();
      if(x.equals("A"))System.out.println("T");
      if(x.equals("T"))System.out.println("A");
      if(x.equals("G"))System.out.println("C");
      if(x.equals("C"))System.out.println("G");
      sc.close();
    }
}
