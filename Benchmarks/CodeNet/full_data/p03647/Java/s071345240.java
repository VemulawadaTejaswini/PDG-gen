import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] convert = sc.nextLine().split(" ");
        int n = Integer.parseInt(convert[0]);
        int m = Integer.parseInt(convert[1]);
        
        if((n >= 3 && n <= 200000) && (m >= 1 && m <= 200000)){
            String[] str = new String[m];
            for(int i = 0; i < m; i++){
                str[i] = sc.nextLine();
            }

            ArrayList<String> from = new ArrayList<String>();
            ArrayList<String> to = new ArrayList<String>();
        
            for(int i = 0; i < str.length;i++){
                if(str[i].startsWith("1"))
                    from.add(str[i]);
                if(str[i].endsWith(Integer.toString(n)))
                    to.add(str[i]);
            }
            
            for(int i = 0; i < to.size(); i++){
                char t = to.get(i).charAt(0);
                for(int j = 0; j < from.size(); j++){
                    char f = from.get(j).charAt(2);
                    if(Character.toString(t).equals(Character.toString(f))){
                        System.out.println("POSSIBLE");
                        return;
                    }
                }
            }          
            System.out.println("IMPOSSIBLE");
        }
        
    } 
}
