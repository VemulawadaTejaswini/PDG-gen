import java.util.*;

/**
 * Created by Seiya on 2016/10/16.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String t = scanner.next();
        String s = new String();


        String[] mozi = new String[4];
        
        mozi[0] = "dream";
        mozi[1] = "dreamer";
        mozi[2] = "erase";
        mozi[3] = "eraser";
        
        int ok = -1;
        while(ok == -1){

            for (int i = 0; i < 4; i++) {
                int min = Math.min(t.length(), mozi[i].length());
                String temp = t.substring(t.length() - min, t.length());
                // System.out.println(temp);
                if(temp.equals(mozi[i])){
                    t = t.substring(0, t.length() - min);
                    ok = -1;
                    break;
                }
                ok = 0;
            }
            if(t.length() == 0){
                ok = 1;
            }

        }
        if(ok == 0){
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }
        

    }


    public static String reverse(String s){
        String ans = new String();

        for (int i = s.length() - 1; i >= 0; i--) {
            ans = ans + s.charAt(i);
        }

        return ans;
    }
}


