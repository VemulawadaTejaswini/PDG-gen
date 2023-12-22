
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String ans = "WA";
        out: if(str.charAt(0) == 'A' && Character.isLowerCase(str.charAt(1)) && Character.isLowerCase(str.charAt(str.length()-1))){
            for(int i = 2; i < str.length()-1; i++){
                char c = str.charAt(i);
                if(Character.isUpperCase(c)){
                    if(c == 'C'){
                        if(ans == "AC"){
                            ans = "WA";
                            break out;
                        }
                        else
                            ans = "AC";
                    }
                    else
                        break out;
                }
                
            }
        }
        System.out.println(ans);
        
    }
    
}
