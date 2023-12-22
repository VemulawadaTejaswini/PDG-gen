
import java.util.*;
class Main
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println(getData(in.nextInt(), in.nextInt(), in.next()));
    }

    public static String getData(int a, int b, String s){
        for (int i = 0; i < s.length(); i++){
            if (i < a){
                //System.out.println(s.charAt(i));
                if (s.charAt(i) < 48 || s.charAt(i) > 57) return "No";
            }
            else if (i == a){
                //System.out.println(s.charAt(i));
                if (s.charAt(i) != '-') return "No";
            }
            else{
                //System.out.println(s.charAt(i));
                if (s.charAt(i) < 48 || s.charAt(i) > 57) return "No";
            }
            
        }
        return "Yes";
    }
}
