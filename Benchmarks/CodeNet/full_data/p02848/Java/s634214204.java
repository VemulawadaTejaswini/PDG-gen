
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        String a=in.next();
        int b = in.nextInt();
        char[] ch = new char[a.length()];
        if(b==0){
            System.out.println(a);
        }
        else{
           
            for (int i = 0; i < a.length(); i++) { 
                ch[i] = (char) (a.charAt(i)+b); 
            }
        }
        for (int i = 0; i < a.length(); i++) {
            System.out.print(ch[i]);
        }
        
    }
    
}