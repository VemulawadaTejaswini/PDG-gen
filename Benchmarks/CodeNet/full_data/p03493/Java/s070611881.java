import java.util.Scanner;


public class Main{
    public  static void main(String[] args) {
    	try (Scanner sc = new Scanner(System.in)) {
    		String str=sc.next();
    		int turn=0;
    		for(int i=0; i<str.length(); i++) {
    			if(str.charAt(i)=='1') {
    				turn++;
    			}
    		}
    		System.out.println(turn);
    	}
    }
}