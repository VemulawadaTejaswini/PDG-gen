import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		String s = sc.next();
        StringBuffer shifts = new StringBuffer();
        
        for (int i=0; i<s.length(); i++) {
          char c = s.charAt(i);
          int shift = c + n;
          if (shift >= 91) {
            shift -= 26;
          }
          char shiftc = (char)shift;
          shifts.append(shiftc);       
        }
        System.out.println(shifts);
	}
}