import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s[][] = new String[n][10];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next().split("");
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (isAnagram(s[i], s[j])) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
    
    static boolean isAnagram(String s1[], String s2[]) {
        String s1_copy[] = new String[s1.length];
        String s2_copy[] = new String[s2.length];

        for (int i = 0; i < s1.length; i++) {
            s1_copy[i] = s1[i];
        }
        for (int i = 0; i < s2.length; i++) {
            s2_copy[i] = s2[i];
        }

        for (int i = 0; i < s1_copy.length; i++) {
            for (int j = 0; j < s2_copy.length; j++) {
                if (s1_copy[i].equals(s2_copy[j])) {
                    s1_copy[i] = "0";
                    s2_copy[j] = "-1";
                }
            }
        }

        for (int i = 0; i < s1_copy.length; i++) {
            if (!(s1_copy[i].equals("0"))) {
                return false;
            }
        }

        return true;
    }
}
