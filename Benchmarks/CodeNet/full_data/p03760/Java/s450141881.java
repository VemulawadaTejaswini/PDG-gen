import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	char[] o = sc.next().toCharArray();
      	char[] e = sc.next().toCharArray();
      	String s = "";	
      
      	for(int i = 0; i < e.length; i++){
        	s += String.valueOf(o[i]);
          	s += String.valueOf(e[i]);
        }
      	if(o.length!=e.length) s += String.valueOf(o[o.length-1]);
      	System.out.println(s);
    }
}