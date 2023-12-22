import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s =	sc.next();
	int min = 1000;
	for(int i = 0; i<s.length()-2; i++) {
            String str = s.substring(i,i+3);
	    int x = Math.abs(753-Integer.parseInt(str));
	    if(min>x) min = x;
	}
        System.out.println(min);
    }
}