import java.util.Scanner;
public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String s = teclado.next();
        Boolean check = false;
       for(int x = 0; x <= s.length(); x++){
           if(s.charAt(x) == s.charAt(x+1)){
                check = true;
                break;
   }
       }
       if(check){
           System.out.println("Bad");
       }else{
           System.out.println("Good");
       }
    }   
    }