import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        String ans="";
        String[] s=new String[n];
        int[][] al=new int[n+1][26];
        for (char i = 'a'; i <= 'z'; i++) {
            al[n][(int)(i-97)]=50;
        }
        for (int i = 0; i < n; i++) {
            s[i]=sc.next();
            for (int j = 0; j < s[i].length(); j++) {
                al[i][(int)(s[i].charAt(j)-97)]++;
            }
            for (char j = 'a'; j <= 'z'; j++) {
                al[n][(int)(j-97)]=min(al[i][(int)(j-97)],al[n][(int)(j-97)]);
            }
        }
        for (char i = 'a'; i <= 'z'; i++) {
            for (int j = 0; j < al[n][(int)(i-97)]; j++) {
                ans+=Character.toString(i);
            }
        }
        out.println(ans);
    }
}