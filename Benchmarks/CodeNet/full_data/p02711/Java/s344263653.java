import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);
        
        String n = sn.nextLine();
        String tmp = null;
        int cnt = 0;
        
        for(int i = 0; i < n.length(); i++) {
            tmp = n.substring(i, i + 1);
            
            if(tmp.equals("7")){
                System.out.print("Yes");
                return;
            }
        }
        
        System.out.print("No");
    }
}
