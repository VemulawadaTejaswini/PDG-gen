import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int[] az = new int[26];
                String s = sc.next();
                Arrays.fill(az , 0);
                for(int i = 0 ; i < s.length() ; i++){
                        az[(int)(s.charAt(i) - 97)]++;
                }
                sc.close();
                boolean ebishu = true;
                for(int i = 0 ; i < 26 ; i++){
                        if(az[i] % 2 != 0) ebishu = false;
                }
                if(ebishu){
                        System.out.println("Yes");
                }else{
                        System.out.println("No");
                }
        }
}//a_97
//鶏になれ