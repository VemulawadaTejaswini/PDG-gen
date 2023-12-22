import java.util.*;
class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	String s = sc.next();
      	String t = sc.next();
      	int st = Integer.parseInt(s + t);
      	String ans = "No";
      	for(int i = 1; i <= 400; i++){
        	if(st == i*i){
            	ans = "Yes";
              	break;
            }
        }
      	System.out.println(ans);
    }
}
