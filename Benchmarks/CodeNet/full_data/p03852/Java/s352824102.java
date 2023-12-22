import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
        String C = sc.next();
        char[]c = C.toCharArray();
        
        if(c[0]=='a' || c[0]=='i' || c[0]=='u' || c[0]=='e' | c[0]=='o') {
            System.out.println("vowel");
        }else {
        	System.out.println("consonant");
             }
     }
}