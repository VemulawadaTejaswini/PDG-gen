import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        String postnumber = sc.next();
        
        
        Pattern pattern = Pattern.compile("^[0-9]{"+x+"}-[0-9]{"+y+"}$");
        Matcher matcher = pattern.matcher(postnumber);
        
        if(matcher.find()){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        
    }
}
