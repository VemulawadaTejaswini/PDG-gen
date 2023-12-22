import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        
        int len = line.length();
        
        String result = "";
        
        for(int i = 0; i < len; i++)
        {
            result = result + "x";
        }
        
        System.out.println(result);
    }
}
