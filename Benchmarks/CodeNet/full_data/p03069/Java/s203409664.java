import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int i = 0;
        int j = n-1;
        while(i < n && s.charAt(i) == '.') i++;
        while(j >= i && s.charAt(j) == '#') j--;
        String substr = s.substring(i, j+1);
        int countW = 0;
        int countB = 0;
        for(int k = 0; k < substr.length(); k++) {
            if(substr.charAt(k) == '.') countW++;
            else countB++;
        }
        System.out.println(Math.min(countB, countW));
    }
}
