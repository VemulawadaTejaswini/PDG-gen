import java.lang.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.charAt(0)!=s.charAt(1)){
            if(s.charAt(2)==s.charAt(3)){
                if(s.charAt(4)==s.charAt(5)){
                     System.out.print("Yes");
                }
                else{
                    System.out.print("No");
                }
            }
            else{
                 System.out.print("No");
            }
        }
        else{
            System.out.print("No");
        }
    }
}
