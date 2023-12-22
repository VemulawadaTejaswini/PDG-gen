import java.util.*;
public class Main{
	private static String board = "CODEFESTIVAL2016";
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);

        while(cin.hasNext()){
            String a = cin.next();
            System.out.println(count(a));
        }
    }
    public static int count(String s){
    	int count = 0;
    	for(int i=0;i<16;i++){
    		if(s.charAt(i)!=board.charAt(i)) count++;
    	}
    	return count;
    }
}