import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	String a = sc.next();
      	String b = sc.next();
      	int ab = Integer.parseInt(a + b);
      	String ans = "No";
      	for(int i = 1; i <= 320; i++){
        	if(i*i == ab){
            	ans = "Yes";
              	break;
            }
        }
      	System.out.println(ans);
    }
}