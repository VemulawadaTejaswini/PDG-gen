import java.util.*;
public class Solution{
	public static void main(String[]args){
    	Scanner in = new Scanner(System.in);
      	String n = in.nextLine();
      	int h = Integer.valueOf(n.substring(0,n.indexOf(' ')));
      	int a = Integer.valueOf(n.substring(n.indexOf(' ')+1));
      	int i = 0 ;
      	while(a<h){
        	a+=a;i++;
        }
      	System.out.println(i);
    }
}