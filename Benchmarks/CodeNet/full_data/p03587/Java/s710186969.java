import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
               int count = 0;
               for ( int i = 0; i < 6; i++ ) {
                   char c = s.charAt(i);
                   if ( c == '1' ) count++;
               }
               System.out.println(c);
	}
}