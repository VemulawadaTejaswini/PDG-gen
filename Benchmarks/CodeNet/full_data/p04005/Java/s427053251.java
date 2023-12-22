import java.util.*;
import java.util.Arrays;
 
class Main {
 
    private static Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
    	long[] t = new long[3];
  		t[0] =Long.parseLong(sc.next());
  		t[1] =Long.parseLong(sc.next());
  		t[2] =Long.parseLong(sc.next());
  		Arrays.sort(t);
  		if(t[0]%2==1 && t[1]%2==1 && t[2]%2==1){
  			System.out.println(t[0]*t[1]);
  		}else{
  			System.out.println(0);
  		}
 
    }
}