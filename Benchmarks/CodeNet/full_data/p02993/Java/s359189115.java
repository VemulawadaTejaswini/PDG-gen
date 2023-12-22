import java.util.Objects;
import java.util.Scanner;
public class sample02{
    void run(){
        Scanner scan  = new Scanner(System.in);
        String input  = scan.nextLine();
        scan.close();
        
        String output = judge(input);

        System.out.printf("%s%n", output);
    }
    String judge(String input){
        Character c1, c2 = 'y';
        c1= input.charAt(0);
        for(Integer i=1; i<input.length(); i++){
            c2 = c1;
            c1= input.charAt(i);
            if( Objects.equals(c1, c2) ){
                return "Bad";
            }
        }
        return "Good";
        
    }
    public static void main(String[] args){
        sample02 app = new sample02();
        app.run();
    }
}
