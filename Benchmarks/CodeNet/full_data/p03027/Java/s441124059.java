import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int count = stdIn.nextInt();
        
        for(int i = 0; i < count; i++){
            long syoko = Integer.parseInt(stdIn.next());
            long tousa = Integer.parseInt(stdIn.next());
            long kousu = Integer.parseInt(stdIn.next());
            long seki = 1;
            
            for(int j = 1; j <= kousu; j++){
                seki = seki * syoko;
                
                seki = seki % 1000003;
                
                syoko += tousa;
                
            }
            
            
            System.out.println(seki);
        }
    }
}