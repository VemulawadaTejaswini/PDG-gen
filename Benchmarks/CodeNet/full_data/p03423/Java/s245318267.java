import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.close();
      int count = -1;
      while(n >= 0){
      	n -= 3;
        count++;
      }
      sc.close();
    }
}