import java.util.*;
import java.math.*;

public class Main{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int nlen = n.length();
        int res = 0;
        
        for(int i=0; i<nlen-3; i++) {
            for(int j=i+4; j<nlen+1; j++) {
                String s = n.substring(i, j);
                double num = Double.valueOf(s);
                if(num%2019 == 0) {
                    res++;
                }
            }
        }
        System.out.println(res);
	}
}