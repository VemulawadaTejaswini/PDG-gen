import java.util.*;
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        if (s.length() == 26) {
        	String ans = "";
        	char start = s.charAt(25);
        	for (int i = 24; 0 <= i; i--) {
        		if (s.charAt(i) < start) {
        			if (start == 'z') {
        				String tmp = s.substring(i+1,s.length());
        				char add = 'z';
        				for (char c :tmp.toCharArray()) {
        					if (s.charAt(i) < c) {
        						add = (char)Math.min(add, c);
        					}
        				}
        				
        				ans = s.substring(0,i) + add;
        				break;
        			} else {
        				ans = s.substring(0, i) + start;
        				break;
        			}
        		} else {
        			start = s.charAt(i);
        		}
        	}
        	
        	System.out.println(ans.length() == 0 ? -1 : ans);
        } else {
        	for (int i = 'a'; i <= 'z'; i++) {
        		if (s.indexOf(i) == -1) {
        			System.out.println(s + (char)i);
        			break;
        		}
        	}
        }
    }
}