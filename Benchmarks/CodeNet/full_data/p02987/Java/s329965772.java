import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        String s = stdIn.next();
        char c[] = s.toCharArray();
        Arrays.sort(c);
        
        if(c[0] == c[1] && c[2] == c[3]){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
