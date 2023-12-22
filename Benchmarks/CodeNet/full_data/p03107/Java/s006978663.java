import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count0 = 0;
        int count1 = 0;
        for(int i = 0; i < s.length(); i++){
        	if(s.charAt(i) == '0'){
            	count0++;
            }else{
            	count1++;
            }
        }
        int ans = Math.min(count0, count1);
        System.out.println(ans * 2);
    }
}