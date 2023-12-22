
import java.util.*;

public class Main {
		  public static void main(String[] args){
		    Scanner sc = new Scanner(System.in);
		    long a = sc.nextInt();
		    long b = sc.nextInt();
		    long ans = ((a+1)/2)*((b+1)/2)+(a/2)*(b/2);  
		    System.out.println(ans);
		  }
		}