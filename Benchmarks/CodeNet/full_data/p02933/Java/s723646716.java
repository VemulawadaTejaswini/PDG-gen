import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
	Scanner scn = new Scanner(System.in);
	int a = scn.nextInt();
      String s = scn.next();
      if(a<2800 || a>=5000){
        s = "red";
      }
      System.out.println(s);
	}
}
