import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   char[] s = sc.next().toCharArray();
   char[] t = sc.next().toCharArray();
   
   Arrays.sort(s);
   Arrays.sort(t,Comparator.reverseOrder());
   String S = new String(s);
   String T = new String(t);
   
   String ans = "No";
   if(S<T) ans = "Yes";
   System.out.println(ans);
 }
}