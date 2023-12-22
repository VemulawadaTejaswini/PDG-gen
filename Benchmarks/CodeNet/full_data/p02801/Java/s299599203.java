import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String C = stdIn.next();    
        stdIn.close();

        String[] alp = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        for (int i = 0; i < 26; i++) {
            if (C.equals(alp[i])) {
                C = alp[i+1];
                System.out.println(C);
                break;
            }
        }
    }
}
