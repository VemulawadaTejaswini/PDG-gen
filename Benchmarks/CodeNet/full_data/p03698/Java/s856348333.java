import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Your code here!
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i) == s.charAt(j)){
                    System.out.println("no");
                    return;
                }
            }
        }
        System.out.println("yes");
    
    }
}