import java.util.*;

class Main {
	public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int h = 1;
        int bLen = String.valueOf(b).length();
        for (int i=0 ; i<bLen ; i++) {
            h = h*10;
        }
        int ab = (a*h)+b;
        double lootb = Math.sqrt(b);
        int lb = (int) (lootb);
        if(lb*lb==ab) 
        	System.out.println("Yes");
        else
        	System.out.println("No");
	}
}